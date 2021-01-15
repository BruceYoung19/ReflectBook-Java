package com.example.reflectbook_java;

public class user {
    private String firstN, lastN,gender,problem;

    public user(String fname, String lname,String gender, String problem){
    this.firstN = fname;
    this.lastN = lname;
    this.gender = gender;
    this.problem = problem;
    }


    //getter and setters
    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}
