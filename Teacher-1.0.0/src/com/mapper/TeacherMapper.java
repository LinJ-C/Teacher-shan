package com.mapper;

import java.util.List;
import java.util.Map;
import com.dao.Teacher;


public interface TeacherMapper {

	//��½�жϷ���
	Teacher login(Map map);
	int total();
	String years();
	
}
