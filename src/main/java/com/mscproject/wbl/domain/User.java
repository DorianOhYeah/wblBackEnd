package com.mscproject.wbl.domain;

public class User {
    private int id;
    private String name;
    private String company;
    private int telphone;
    private String password;
    private String email;
    public User(int id){
        this.id = id;
        this.name = "wbl";
        this.company = "wbl";
        this.telphone = -2;
        this.email = "wbl";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getTelphone() {
        return telphone;
    }

    public void setTelphone(int telphone) {
        this.telphone = telphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){};
}
