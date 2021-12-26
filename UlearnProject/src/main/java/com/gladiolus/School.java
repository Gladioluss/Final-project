package com.gladiolus;

public class School {
    private final String school;
    private final String county;
    private final int students;
    private final double expenditure;
    private final double math;

    public School(String school, String county, int students, double expenditure,double math){
        this.school = school;
        this.county = county;
        this.students = students;
        this.expenditure = expenditure;
        this.math = math;
    }
    public String getSchool(){return school;}
    public String getCounty(){ return county;}
    public int getStudents() {return students;}
    public double getExpenditure(){return expenditure;}
    public double getMath(){return math;}
}
