package com.example.myfirstapi.models;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;


public class Movies {

    @Id
    private ObjectId _id;

    private String id;
    private String title;
    private String year;
    private List<String> genres;
    private List<Integer> ratings;
    private String poster;
    private String contentRating;
    private String duration;
    private String releaseDate;
    private Integer averageRating;
    private String originalTitle;
    private String storyline;
    private List<String> actors;
    private Integer imdbRating;
    private String posterurl;

    public Movies() {}

    public Movies(ObjectId _id, String id, String title, String year, List<String> genres, List<Integer> ratings, String poster, String contentRating, String duration, String releaseDate, Integer averageRating, String originalTitle, String storyline, List<String> actors, Integer imdbRating, String posterurl) {
        this._id = _id;
        this.id = id;
        this.title = title;
        this.year = year;
        this.genres = genres;
        this.ratings = ratings;
        this.poster = poster;
        this.contentRating = contentRating;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.averageRating = averageRating;
        this.originalTitle = originalTitle;
        this.storyline = storyline;
        this.actors = actors;
        this.imdbRating = imdbRating;
        this.posterurl = posterurl;
    }


    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Integer averageRating) {
        this.averageRating = averageRating;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public Integer getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Integer imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getPosterurl() {
        return posterurl;
    }

    public void setPosterurl(String posterurl) {
        this.posterurl = posterurl;
    }
}
