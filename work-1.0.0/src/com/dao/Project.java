package com.dao;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class Project {
	
		private String projectId;
		private String name;
		private String projectYear;
		private String jobDescription;
		
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
		private Date startTime;
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
		private Date endTime;
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
		private Date createTime;
		
		private String itemId;
		private String status;
		private String tId;
		private String tName;
		
		public String getProjectId() {
			return projectId;
		}
		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getProjectYear() {
			return projectYear;
		}
		public void setProjectYear(String projectYear) {
			this.projectYear = projectYear;
		}
		public String getJobDescription() {
			return jobDescription;
		}
		public void setJobDescription(String jobDescription) {
			this.jobDescription = jobDescription;
		}
		public Date getStartTime() {
			return startTime;
		}
		public void setStartTime(Date startTime) {
			this.startTime = startTime;
		}
		public Date getEndTime() {
			return endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public Date getCreateTime() {
			return createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public String getItemId() {
			return itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String gettId() {
			return tId;
		}
		public void settId(String tId) {
			this.tId = tId;
		}
		public String gettName() {
			return tName;
		}
		public void settName(String tName) {
			this.tName = tName;
		}






}
