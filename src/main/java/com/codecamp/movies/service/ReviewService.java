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
    MongoTemplate mongoTemplate;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review createReview(String reviewBody, String imdbId) {
        Review review = reviewRepository.insert(new Review(reviewBody));
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();
        return review;
    }
}

