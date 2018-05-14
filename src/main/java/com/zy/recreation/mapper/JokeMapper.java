package com.zy.recreation.mapper;

import com.zy.recreation.pojo.Joke;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 笑话大全接口
 * Created by zy on 04/05/2018.
 */
@Mapper
public interface JokeMapper {
    /**
     * 随机取20条笑话数据
     * @return
     */
    List<Joke> findByRandom ();
}
