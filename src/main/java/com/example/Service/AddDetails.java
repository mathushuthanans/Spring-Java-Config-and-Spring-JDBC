package com.example.Service;

import java.util.Scanner;

import com.example.Repository.JDBC;

public class AddDetails {
    private Applicant applicant;
    private  JDBC jdbc;


    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public JDBC getJdbc() {
        return jdbc;
    }

    public void setJdbc(JDBC jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Scanner sc){
        System.out.print("Enter the ID: ");
        applicant.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter the Name: ");
        applicant.setName(sc.nextLine());

        System.out.print("Enter the Apply for: ");
        applicant.setApplyFor(sc.nextLine());
        
        jdbc.save(applicant); 
        System.out.println(applicant.toString());   
    }
}
