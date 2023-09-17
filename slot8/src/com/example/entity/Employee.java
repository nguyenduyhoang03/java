package com.example.entity;

public class Employee {
    private String name;
    private int age;
    private int employeeId;
    public Employee(String name, int age, int id){
        super();
        this.name = name;
        this.age = age;
        this.employeeId = id;
    }
    public String getName(){return name;}
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int id){
        this.employeeId = id;
    }

    @Override
    public String toString() {
        return "com.example.model.Employee [name = " + name +
                ", age = " + ", employeeId = " + employeeId + "]";
    }
}
