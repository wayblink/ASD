package com.wayblink.Dao;

import org.apache.ibatis.annotations.Param;

import com.wayblink.entity.Message;

public interface MessageMapper {
//    public List<Student> getStudents(@Param("parameter")String parameter);
    public Message get(@Param("id")int id);
    public void add(@Param("content")String content);
    public void delete(@Param("id")int id);
    public void update(int id, String content);
}
