package com.codecamp.trivia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trivia {
    @Id
    private ObjectId id;
    private String question;
    private String answer;
    private String type;
    private String category;
    private String book;
    private String page;
}
