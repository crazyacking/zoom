package com.hut.crazyacking.mapper;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.List;

/**
 * Created by crazyacking on 2016/12/17.
 */
public interface SignUpMapper {
    Integer addNewSignUp(JSONObject paramJson);

    List<HashMap> getAllSignUp(JSONObject paramJson);
}