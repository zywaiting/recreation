package com.zy.recreation.controller;

import com.alibaba.fastjson.JSON;
import com.zy.recreation.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by zy on 04/05/2018.
 */
@RestController
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping(value = "/api/joke", method = RequestMethod.GET)
    public String findOneCity() {
        String json = JSON.toJSONString(jokeService.findByRandom());
        return json;
    }
}
