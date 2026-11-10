package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int start;


    public void punchIn(int time) {
        start = time;
    }
    public void punchOut(int time) {
        int end = time;
        hoursWorked = hoursWorked + (end - start);
    }

    public int getOvertimeHours() {
        if (hoursWorked > 40) {
            return  hoursWorked - 40;
        }
        return 0;
    }

    public int getRegularHours() {
        if (hoursWorked < 40) {
            return hoursWorked;
        }
        return 40;
    }

    public double getTotalPay() {
        return getRegularHours() * payRate + (getOvertimeHours() * (1.5 * payRate));
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
