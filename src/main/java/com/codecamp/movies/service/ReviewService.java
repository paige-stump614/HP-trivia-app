package com.codecamp.movies.service;

        import com.codecamp.movies.model.Movie;
        import com.codecamp.movies.model.Review;
        import com.codecamp.movies.repository.ReviewRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.data.mongodb.core.MongoTemplate;
        import org.springframework.data.mongodb.core.query.Criteria;
        import org.springframework.data.mongodb.core.query.Update;
        import org.springframework.stereotype.Service;


@Service
public class ReviewService {
    private ReviewRepository reviewRepository;
    @Autowired
    MongoTemplate mongoTempalte;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review createReview(String reviewBody, String imdbId) {
        Review review = new Review(reviewBody);
        reviewRepository.insert(review);
        mongoTempalte.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review));
        return review;
    }
}

