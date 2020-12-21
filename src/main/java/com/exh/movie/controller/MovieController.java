package com.exh.movie.controller;


import com.exh.movie.entity.Movie;
import com.exh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieService service;

    @RequestMapping("retrieve.do")
    public Movie retrieve(@RequestParam("keyWord") String keyWord){
        return service.SelectOne(keyWord);//(现在连接了数据库)以后用于连接Spark
    }


    @RequestMapping("allGenres.do")
    @ResponseBody
    public List<String> allGenres(){
        return service.selectAllGenres();//之后使用Spark返回结果(目前调用Mybatis从MySQL中查询)
    }


}
