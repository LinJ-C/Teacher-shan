package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.dao.Page;
import com.dao.Project;
import com.dao.Teacher;
import com.dao.Works;
import com.service.TeacherService;

@Controller
@RequestMapping("")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	//判断登陆函数
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
	
	@ResponseBody
	@RequestMapping("/years")
	public String  years() {
	String year=teacherService.years();
		return year;
	}
	
	//显示某个教师的工作量
    @ResponseBody
	@RequestMapping("/scan_work")
	public String scan_work(Teacher teacher){
		List<Works> list=teacherService.scan_work(teacher.gettId());
		return JSONObject.toJSON(list).toString();
	}
	
	
	
	//控制跳转页面
	@RequestMapping("/html/{where}")
	public String tiaozhuan(@PathVariable String where) {
		return where;
	}
	
	//分页功能
	@ResponseBody
	@RequestMapping("/publicity_show")
	public String publicity(Page page) {
		
		int total =teacherService.total();
		page.caculateLast(total);
		System.out.print(page.getStart());
		
		List<Works> list=teacherService.publicity(page);
		return JSONObject.toJSON(list).toString();
	}
	
	//提交工作量（项目
	@ResponseBody
	@RequestMapping("/project_submit")
	public String project_submit(@RequestBody Project project) {
		
		System.out.print(project.getName());
		System.out.print(project.getProjectYear());
		System.out.print(project.getStartTime());
		System.out.print(project.getJobDescription());
		
		teacherService.submit(project);
		
		return "ok";
	}

	 
	
}









