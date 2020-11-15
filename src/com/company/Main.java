package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your temperature");
        Scanner temp = new Scanner(System.in);
        double t =temp.nextDouble();
        System.out.println("Do you have cough?");
        Scanner cough = new Scanner(System.in);
        String c = cough.nextLine();
        System.out.println("Do you chest pain");
        Scanner pain = new Scanner(System.in);
        String p = pain.nextLine();
        if (t<37.5 && t>=36 && c.equals("no") && p.equals("no")){
            System.out.println("you are healthy you need to go to work");

        }else if (t>=37.5 && t<=42 && c.equals("no") && p.equals("no")){
            System.out.println("you put thermometer in hot tea you are health and you need to go to work");
        }else if (t>=37.5 && t<=42 && c.equals("yes") && p.equals("no")){
            System.out.println("you have a flu, stay in bed");
        }else if (t>=37.5 && t<=42 && c.equals("no") && p.equals("yes")){
            System.out.println("you have broken ribbons try not to brathe");
        }else if(t>=37.5 && t<=42 && c.equals("yes") && p.equals("yes")){
            System.out.println("you have coronavirus");
        }else{
            System.out.println("I think you are dead");
        }
    }
}
