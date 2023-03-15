package com.sidorg.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

/*This @Document lets app know
this Class represents each document in
movies collectionkl
all */
@Document(collection="movies")
/*This @Data comes from lombok and takes care of
* Getter,setters and toStringMethods
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    /*Id annotation will consider as an unique property */
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    /**
     * Manual Reference Relationship. This
     * @DocumentReference will store the id's
     * of reviewIds in this collection and
     * will store rest of it
     * in a separate collection
     * */
    @DocumentReference
    private List<Review> reviewIds;
}
