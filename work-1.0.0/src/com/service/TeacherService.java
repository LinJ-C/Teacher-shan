package com.service;

import java.util.List;
import java.util.Map;

import com.dao.Page;
import com.dao.Project;
import com.dao.Teacher;
import com.dao.Works;

public interface TeacherService {
	
	Teacher login(Map map);
	List<Works> scan_work(String tId);
	List<Works> publicity(Page page);
	int total();
	void submit(Project project);
	String years();
}
