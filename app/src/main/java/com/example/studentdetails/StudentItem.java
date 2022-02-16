package com.example.studentdetails;

public class StudentItem {
    private int id;
    private String name;
    private String roll;
    private String email;
    private String department;

    public StudentItem(int id, String name, String roll, String email, String department){
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.department = department;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public int getId() {
        return id;
    }

    public String getEmail(){
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
