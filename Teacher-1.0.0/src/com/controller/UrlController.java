package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.Teacher;
import com.service.TeacherService;

@Controller
@RequestMapping("")
public class UrlController {
	
	@Autowired
	TeacherService teacherService;
	
	//¿ØÖÆÌø×ªÒ³Ãæ
	@RequestMapping("/html/{where}")
	public String tiaozhuan(@PathVariable String where) {
		return where;
	}
	
	
	//ÅÐ¶ÏµÇÂ½º¯Êý
	@ResponseBody
	@RequestMapping("/login")
	public Teacher login(@RequestBody Teacher teacher) {
		Map<String,Object> params =new HashMap<>();
		params.put("tId", teacher.gettId());
		params.put("passwd", teacher.getPasswd());
		Teacher getTeacher=teacherService.login(params);
		if(getTeacher.gettName()!=null&&getTeacher.gettName()!="") {
			return getTeacher;
		}
		else {
			return getTeacher;
		}
	}
}
