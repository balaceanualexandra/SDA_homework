package com.sda.balaceanuale.curs.week4.part1;

// 1. Declare a class named Employee with attributes: name, jobTitle, jobAge
// 2. Declare a method that allows us to change the jobTitle (call it: `setJobTitle`)
// 3. Declare a method that allows us to change the jobAge (call it: `setJobAge`)
public class Employee {
    // fields declaration
    protected String name;
    String jobTitle;
    private int jobAge;

    // Constructor
    public Employee(String name, String jobTitle, int jobAge) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.jobAge = jobAge;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //setter
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //setter
    public void setJobAge(int jobAge) {
        this.jobAge = jobAge;
    }

    //getter
    public String getName() {
        return name;
    }

    //getter
    public String getJobTitle() {
        return jobTitle;
    }

    //getter
    public int getJobAge() {
        return jobAge;
    }
}
