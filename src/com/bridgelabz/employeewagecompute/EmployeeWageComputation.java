package com.bridgelabz.employeewagecompute;

import java.util.Random;
public class EmployeeWageComputation {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HR=20;
	public static final int NUM_WORKING_DAYS=20;
	int empCheck=0;
	int empHrs=0;
	int totalEmpWage=0;
	int empWage=0;
        public void employeeCheck() {
	    for (int i = 0; i <= NUM_WORKING_DAYS; i++) {
	        Random random = new Random();
	        empCheck = random.nextInt(3);
	        switch (empCheck) {
    	        case IS_FULL_TIME:
    	            empHrs = 8;
    	 	    break;
    	        case IS_PART_TIME:
    	            empHrs = 4;
    	            break;
    	        default:
    	            empHrs = 0;
    	            break;
    	     }
	     empWage = WAGE_PER_HR * empHrs;
    	     totalEmpWage += empWage ;
    	     System.out.println("Daily wage of the employee: " + empWage);
	}
	System.out.println("Total Employee Wage for a Month is: " + totalEmpWage );
	}
	public static void main(String[] args) {
		EmployeeWageComputation empwage = new EmployeeWageComputation();
		empwage.employeeCheck();
	}
}
