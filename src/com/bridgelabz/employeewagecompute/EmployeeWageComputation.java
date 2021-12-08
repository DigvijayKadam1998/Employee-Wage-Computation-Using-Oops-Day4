package com.bridgelabz.employeewagecompute;

import java.util.Random;
public class EmployeeWageComputation {
    int IS_FULL_TIME = 1;
    int WAGE_PER_HR=20;
    int empCheck=0;
    int empHrs=0;
    int empWage=0;
    public void getAttendance() {
	Random r = new Random();
	empCheck = r.nextInt(2);
    }
    public void employeeCheck() {
    	if(empCheck==IS_FULL_TIME){
    	    empHrs=8;
    	    System.out.println("Employee is Present");
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
