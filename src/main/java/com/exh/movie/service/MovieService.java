package com.exh.movie.service;

import com.exh.movie.dao.MovieDao;
import com.exh.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieDao dao;

    public Movie SelectOne(String title){
        return dao.selectOne(title);
    }


    public List<Movie> selectList(){
        return dao.selectList();
    }

    public List<String> selectAllGenres(){
        List<Movie> movies = dao.selectList();
        if(movies==null){
            return null;
        }
        List<String> genresList = new ArrayList<>();

        for(Movie movie:movies){
            genresList.add(movie.getGenres());
        }
        return genresList;
    }
}
