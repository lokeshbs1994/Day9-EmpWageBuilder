package com.bridgeLabz;

public class EmpWageBuilderOOPS {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int EMP_RATE_PER_HOUR ;
    private int NUM_OF_WORKING_DAYS;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage builder Using OOPS concepts");
        EmpWageBuilderOOPS empWageBuilderOOPS = new EmpWageBuilderOOPS();
        empWageBuilderOOPS.computeWage(20, 20);
    }

    public void computeWage(int empRatePerHour, int numberOfWorkingDays) {
        this.EMP_RATE_PER_HOUR = empRatePerHour;
        this.NUM_OF_WORKING_DAYS = numberOfWorkingDays;
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Day# " + day + " Emp Wage: " + empWage);
            totalEmpWage += empWage;
        }
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}
