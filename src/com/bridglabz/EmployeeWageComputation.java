package com.bridglabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee\n" +
                "Wage Computation\n" +
                "Program on Master Branch");
        Random num=new Random();
        int present = num.nextInt(2);
//        System.out.println(present);

        if(present==1){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }
    }
}
