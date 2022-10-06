/**
 * 
 */
package com.gl.bean;

/**
 * @author Jayaraj
 *
 */
public class AdminDepartment extends SuperDept {
	
	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return  "Admin Department";
	}
	
	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Complete your documents Submission";
	}
	
	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}
	
	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return super.isTodayAHoliday();
	}

}
