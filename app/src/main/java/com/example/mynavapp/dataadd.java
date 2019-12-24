package com.example.mynavapp;

public class dataadd {


    String institute,address;

    public String getName() {
        return institute;
    }

    public void setName(String name) {
        this.institute = name;
    }

    public String getEmail() {
        return institute;
    }

    public void setEmail(String email) {
        this.address = email;
    }

    public dataadd(String name, String email) {
        this.institute = name;
        this.address = email;
    }
}
