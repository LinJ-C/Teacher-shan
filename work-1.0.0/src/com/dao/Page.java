package com.dao;

public class Page {

	int start=0;
	int count=10;
	int last=0;
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}
	   public void caculateLast(int total) {
	        // ����������50�����ܹ���10�����ģ���ô���һҳ�Ŀ�ʼ����40
	        if (0 == total % count)
	            last = total - count;
	        // ����������51�����ܹ���10�����ģ���ô���һҳ�Ŀ�ʼ����50
	        else
	            last = total - total % count;      
	    }
	 
			
}