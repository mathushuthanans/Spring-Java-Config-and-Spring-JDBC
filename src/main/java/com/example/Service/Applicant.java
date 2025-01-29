package com.example.Service;


public class Applicant {
    private int id;
    private String name;
    private String applyFor;
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
    public String getApplyFor() {
        return applyFor;
    }
    public void setApplyFor(String applyFor) {
        this.applyFor = applyFor;
    }

    public String toString(){
        return "name=" + name + " id=" + id + " apply For=" + applyFor;
    }

}
