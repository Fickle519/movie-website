package com.exh.movie.entity;

import java.util.List;

public class Movie {
    private Integer movieID;
    private String title;
    private String genres;

    private List<Rating> ratingList;
    private List<Tag> tagList;

    public Movie() {
    }

    public Movie(Integer movieID, String title, String genres) {
        this.movieID = movieID;
        this.title = title;
        this.genres = genres;
    }

    public Movie(Integer movieID, String title, String genres, List<Rating> ratingList, List<Tag> tagList) {
        this.movieID = movieID;
        this.title = title;
        this.genres = genres;
        this.ratingList = ratingList;
        this.tagList = tagList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", title='" + title + '\'' +
                ", genres='" + genres + '\'' +
                ", ratingList=" + ratingList +
                ", tagList=" + tagList +
                '}';
    }

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }
}
