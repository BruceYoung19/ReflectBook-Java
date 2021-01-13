package com.example.reflectbook_java;

public class user {
    private String firstN, lastN;

    public user(String fname, String lname){
    this.firstN = fname;
    this.lastN = lname;
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
}
