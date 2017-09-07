package com.wayblink.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wayblink.Dao.StudentMapper;
import com.wayblink.entity.Student;
import com.wayblink.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public Page<Student> getStudents(String parameter, int pageNum, int pageSize) {
		Page<Student> page = PageHelper.startPage(pageNum, pageSize);
		studentMapper.getStudents(parameter);
		return page;
	}

	@Override
	public void addStudents(String name) {
		studentMapper.addStudents(name);
	}

	@Override
	public void deleteStudents(int[] id) {
		studentMapper.deleteStudents(id);
	}

	@Override
	public void updateStudents(int id, String new_name) {
		studentMapper.updateStudents(id, new_name);
	}

}
