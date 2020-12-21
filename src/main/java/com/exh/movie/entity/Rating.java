package com.exh.movie.entity;

import java.util.Date;

public class Rating {
    private Integer userID;
    private Integer movieID;
    private Float score;
    private Date time;

    public Rating() {
    }

    public Rating(Integer userID, Integer movieID, Float score, Date time) {
        this.userID = userID;
        this.movieID = movieID;
        this.score = score;
        this.time = time;
    }


    @Override
    public String
    toString() {
        return "Rating{" +
                "userID=" + userID +
                ", movieID=" + movieID +
                ", score=" + score +
                ", time=" + time +
                '}';
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
