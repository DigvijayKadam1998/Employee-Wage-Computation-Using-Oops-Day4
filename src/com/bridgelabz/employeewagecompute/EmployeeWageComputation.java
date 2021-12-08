package com.bridgelabz.employeewagecompute;

import java.util.Random;
public class EmployeeWageComputation {
    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;
    int WAGE_PER_HR=20;
    int empCheck=0;
    int empHrs=0;
    int empWage=0;
    public void getAttendance() {
	Random r = new Random();
	empCheck = r.nextInt(3);
    }
    public void employeeCheck() {
    	if(empCheck==IS_FULL_TIME){
	    empHrs= 8;
	    System.out.println("Employee is Full Time");
	}
	else if(empCheck==IS_PART_TIME) {
	    empHrs = 4;
	    System.out.println("Employee is Part Time");
	}
	else {
	    System.out.println("Employee is Absent");
	}
	empWage= WAGE_PER_HR * empHrs;
	System.out.println("Daily Wage of Employee is: " + empWage);
    }
    public static void main(String[] args) {
    	EmployeeWageComputation empwage = new EmployeeWageComputation();
    	empwage.getAttendance();
    	empwage.employeeCheck();
    }
}
