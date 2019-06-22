package com.service.Impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.Teacher;
import com.mapper.TeacherMapper;
import com.service.TeacherService;

@Service
public class TeacherserviceImpl implements TeacherService {
	
	@Autowired
	TeacherMapper teacherMapper;
	
	public Teacher login(Map map) {
		return teacherMapper.login(map);
	}
	
	public int total(){
		return teacherMapper.total();
	}
	
	public String years() {
		
		return teacherMapper.years();
	}
	
}
