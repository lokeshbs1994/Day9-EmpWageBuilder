package com.bridgeLabz;

public class EmpWageBuilderOOPS {
    public static final int IS_FULL_TIME = 1;
    public int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage builder Using OOPS concepts");
        EmpWageBuilderOOPS empWageBuilderOOPS = new EmpWageBuilderOOPS();
        empWageBuilderOOPS.computeWage();
    }

    public void computeWage() {
        int empHrs=0;
        int empWage=0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Employee is Present Full time");
        } else {
            System.out.println("Employee is Absent");
        }
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: "+ empWage);
    }
}
