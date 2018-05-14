package com.zy.recreation.service.impl;

import com.zy.recreation.mapper.JokeMapper;
import com.zy.recreation.pojo.Joke;
import com.zy.recreation.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 笑话大全实现类
 * Created by zy on 04/05/2018.
 */
@Service
public class JokeServiceImpl implements JokeService {

    @Autowired
    private JokeMapper jokeMapper;

    /**
     * 查询20条笑话
     * @return
     */
    @Override
    public List<Joke> findByRandom() {
        return jokeMapper.findByRandom();
    }
}
