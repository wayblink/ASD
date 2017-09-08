package com.wayblink.Dao;

import org.apache.ibatis.annotations.Param;

import com.wayblink.entity.Message;

public interface MessageMapper {
//    public List<Student> getStudents(@Param("parameter")String parameter);
    public Message get(@Param("oid")int oid);
    public void add(@Param("oid")int oid, @Param("content")String content);
    public void delete(@Param("oid")int oid);
    public void update(int oid, String content);
}
