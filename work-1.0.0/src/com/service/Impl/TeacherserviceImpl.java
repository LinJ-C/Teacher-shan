package com.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Page;
import com.dao.Project;
import com.dao.Teacher;
import com.dao.Works;
import com.mapper.TeacherMapper;
import com.service.TeacherService;

@Service
public class TeacherserviceImpl implements TeacherService {
	
	@Autowired
	TeacherMapper teacherMapper;
	
	public Teacher login(Map map) {
		return teacherMapper.login(map);
	}
	
	public List<Works> scan_work(String tId){
		return teacherMapper.scan_work(tId);
	};
	
	public List<Works> publicity(Page page){
		return teacherMapper.publicity(page);
	};
	
	public int total(){
		return teacherMapper.total();
	}
	
	public  void submit(Project project) {
		
		 teacherMapper.submit(project);
		
	}
	public String years() {
		
		return teacherMapper.years();
	}
	
}
