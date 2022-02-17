package com.bridgeLabz;

public class EmpWageBuilderOOPS {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private final String COMPANY;
    private final int EMP_RATE_PER_HOUR;
    private final int NUM_OF_WORKING_DAYS;
    private final int MAX_HRS_IN_MONTH;
    private int TOTAL_EMP_WAGE;

    public EmpWageBuilderOOPS(String company, int empRatePerHour, int numberOfWorkingDays, int maxHrs) {
        this.COMPANY = company;
        this.EMP_RATE_PER_HOUR = empRatePerHour;
        this.NUM_OF_WORKING_DAYS = numberOfWorkingDays;
        this.MAX_HRS_IN_MONTH = maxHrs;

    }

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage builder Using OOPS concepts");
        EmpWageBuilderOOPS amazon = new EmpWageBuilderOOPS("AMAZON", 20, 20, 100);
        amazon.computeWage();
        System.out.println(amazon);
        EmpWageBuilderOOPS flipcart = new EmpWageBuilderOOPS("FLIPCART", 10, 15, 100);
        flipcart.computeWage();
        System.out.println(flipcart);
    }

    public void computeWage() {
        int empHrs;
        int empWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpWage;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
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
            totalEmpHrs += empHrs;
            empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Day# " + totalWorkingDays + " Emp Hrs: " + empHrs + " Emp Wage: " + empWage);
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        this.TOTAL_EMP_WAGE = totalEmpWage;
        //System.out.println("Total Emp Wage of an employee in " + COMPANY + " is " + totalEmpWage);
    }
    @Override
    public String toString() {
        return "Total Emp Wage of an employee in " + COMPANY + " is " + TOTAL_EMP_WAGE;
    }
}
