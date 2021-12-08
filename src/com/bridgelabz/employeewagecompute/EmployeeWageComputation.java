package com.bridgelabz.employeewagecompute;

import java.util.Random;
public class EmployeeWageComputation {
    int IS_FULL_TIME = 1;
    int empcheck=0;
    public void getAttendance() {
	Random r = new Random();
	empcheck = r.nextInt(2);
    }
    public void employeeCheck() {
	if(empcheck==IS_FULL_TIME) {
	    System.out.println("Employee is Present");
	}
	else {
	    System.out.println("Employee is Absent");
	}
    }
    public static void main(String[] args) {
    	EmployeeWageComputation empwage = new EmployeeWageComputation();
    	empwage.getAttendance();
    	empwage.employeeCheck();
    }
}
