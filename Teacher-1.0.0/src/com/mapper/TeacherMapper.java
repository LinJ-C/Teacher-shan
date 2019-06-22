package com.mapper;

import java.util.List;
import java.util.Map;
import com.dao.Teacher;


public interface TeacherMapper {

	//µÇÂ½ÅÐ¶Ï·½·¨
	Teacher login(Map map);
	int total();
	String years();
	
}
