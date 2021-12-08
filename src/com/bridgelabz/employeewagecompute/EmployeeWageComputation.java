package com.bridgelabz.employeewagecompute;

import java.util.Random;
public class EmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HR=20;
    public static final int NUM_WORKING_DAYS=20;
    public static final int MAX_HRS_IN_MONTH=100;
    int empHrs=0;
    int totalEmpHrs=0;
    int totalWorkingDays=0;
    int totalEmpWage=0;
    int empCheck=0;
    public void employeeCheck() {
        while (totalEmpHrs<= MAX_HRS_IN_MONTH  && totalWorkingDays < NUM_WORKING_DAYS) {
	    totalWorkingDays++;
            Random random = new Random();
	    empCheck = random.nextInt(3);
	    switch (empCheck) {
	    case IS_FULL_TIME:
	        empHrs =8;
	        break;
	    case IS_PART_TIME:
	        empHrs =4;
	        break;
	    default:
	        empHrs =0;
	 }
	 totalEmpHrs += empHrs;
	 System.out.println("Day:" + totalWorkingDays + " Emp Hr:" +empHrs)
    }
    int totalEmpWage = totalEmpHrs * WAGE_PER_HR;
    System.out.println("Total Emp Wage:" + totalEmpWage);
    }
    public static void main(String[] args) {
        EmployeeWageComputation empwage = new EmployeeWageComputation();
	empwage.employeeCheck();
    }
}
