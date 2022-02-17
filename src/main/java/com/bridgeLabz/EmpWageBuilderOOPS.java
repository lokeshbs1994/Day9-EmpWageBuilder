package com.bridgeLabz;

public class EmpWageBuilderOOPS {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage builder Using OOPS concepts");
        EmpWageBuilderOOPS empWageBuilderOOPS = new EmpWageBuilderOOPS();
        empWageBuilderOOPS.computeWage();
    }

    public void computeWage() {
        int empHrs=0;
        int empWage=0;
        int empCheck = (int)Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                System.out.println("Employee is Present part-time");
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                System.out.println("Employee is Present full-time");
                break;
            default:
                empHrs = 0;
                System.out.println("Employee is Absent");
        }
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: "+ empWage);
    }
}
