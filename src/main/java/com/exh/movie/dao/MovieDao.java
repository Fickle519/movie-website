package com.exh.movie.dao;

import com.exh.movie.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDao {

    List<Movie> selectList();
    Movie selectOne(String title);
    int insertOne(Movie movie);
    int updateOne(Movie movie);
    int deleteOne(int movieID);
}