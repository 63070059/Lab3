package com.example.lab3;

public class Customer {
    private String ID;
    private String name;
    private boolean sex;
    private int age;
    public Customer(){
        this("", null, "female", 0);
    };
    public Customer(String ID, String n, String s, int a){
        if(s.equals("female") || s.equals("Female")){
            this.sex = false;
        } else if (s.equals("male") || s.equals("Male")) {
            this.sex = true;
        }
        if(age < 0){
            this.age = 0;
        }else {
            this.age = a;
        }
        this.ID = ID;
        this.name = n;
    };
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(boolean sex) {
    }
    public int getAge() {
        return age;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public boolean isSex() {
        return sex;
    }
}
