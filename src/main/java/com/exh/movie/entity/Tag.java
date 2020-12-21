package com.exh.movie.entity;

import java.util.Date;

public class Tag {
    private Integer userID;
    private Integer movieID;
    private String tag;
    private Date time;

    public Tag() {
    }

    public Tag(Integer userID, Integer movieID, String tag, Date time) {
        this.userID = userID;
        this.movieID = movieID;
        this.tag = tag;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "userID=" + userID +
                ", movieID=" + movieID +
                ", tag='" + tag + '\'' +
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
