package com.wayblink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wayblink.Dao.StudentMapper;
import com.wayblink.entity.Student;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;
    
    public Page<Student> getStudents(String parameter, int pageNum, int pageSize) {
        Page<Student> page = PageHelper.startPage(pageNum, pageSize);
        studentMapper.getStudents(parameter);
        return page;
    }

    public void addStudents(String name) {
        studentMapper.addStudents(name);
    }

    public void deleteStudents(int[] id) {
        studentMapper.deleteStudents(id);
    }

    public void updateStudents(int id, String new_name) {
        studentMapper.updateStudents(id, new_name);
    }
}