package com.exh.movie.controller;

import com.exh.movie.entity.Rating;
import com.exh.movie.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RatingController {

    @Autowired
    private RatingService service;

    @RequestMapping("grade.do")
    @ResponseBody
    public String dynamicGrade(@RequestParam("movieID") int movieID,@RequestParam("score") float score){
        //连接spark

        return "{\"stat\":\"success\"}";
    }
    @RequestMapping("showScore.do")
    @ResponseBody
    public List<Rating> showScore(){//show the latest 10 records of Rating
        return null;
    }


    @RequestMapping("AvgScoreByType.do")
    @ResponseBody
    public String AvgScoreByType(@RequestParam("type") String genres){

        return "{\"Female\":${num},\"Male\":${num}";

    }


    @RequestMapping("AvgScoreBySexAndType.do")
    @ResponseBody
    public String AvgScoreBySexAndType(@RequestParam("type") String genres,@RequestParam("gender") String gender){
        spark18_mysql2 sm = new spark18_mysql2();
        sm.spark_sql(gender, gender);
        return  "{\"type\"variable : 4.2}";
    }

}
