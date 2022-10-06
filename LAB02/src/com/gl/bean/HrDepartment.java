package com.gl.bean;

public class HrDepartment extends SuperDept {

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Hr Department";
	}
	
	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Fill today’s timesheet and mark your attendance";
	}
	
	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}
	
	public String doActivity() {
		
		return "team Lunch";
		
	}
	
	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return super.isTodayAHoliday();
	}
}
