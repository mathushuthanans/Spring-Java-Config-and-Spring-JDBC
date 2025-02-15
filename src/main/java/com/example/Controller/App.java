package com.example.Controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Repository.JavaConfig;
import com.example.Service.AddDetails;




public class App 
{

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext container = new AnnotationConfigApplicationContext(JavaConfig.class);
        AddDetails add = container.getBean(AddDetails.class);
        Scanner sc = new Scanner(System.in);
        add.save(sc);
    }
    



}
