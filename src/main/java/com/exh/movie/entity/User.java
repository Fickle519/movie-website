package com.exh.movie.entity;

public class User {
    private Integer userID;
    private String gender;
    private Integer age;
    private Integer occupation;
    private String zipCode;

    public User() {
    }

    public User(Integer userID, String gender, Integer age, Integer occupation, String zipCode) {
        this.userID = userID;
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", occupation=" + occupation +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}
