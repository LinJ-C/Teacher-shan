package com.service;

import java.util.List;
import java.util.Map;
import com.dao.Teacher;

public interface TeacherService {
	
	Teacher login(Map map);
	int total();
	String years();
}
