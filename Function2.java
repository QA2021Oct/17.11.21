package com.company;

import java.util.Random;
import java.util.Scanner;

public class Function2 {

    public static void main(String[] args) {

        String user;
        int age;

        for(int i = 0; i < 3; i++){
            Scanner s = new Scanner(System.in);
            System.out.println("What is your Name?? ");
            user = s.nextLine();
            System.out.println("Enter your Age? ");
            age = s.nextInt();
            printHello(user, age);
        }


        int a = 20;
        int b = 30;
        sum(a, b);

        int c = 40;
        int d = 50;
        sum(c,d);

        sum(5,5);
    }

    static void sum(int number1, int number2) {
        int sum = number1 + number2 ;
        System.out.println(sum);
    }

    static void printHello(String name, int userAge){
        System.out.println("Hello "  + name + " You are " + userAge + " years old");
    }
}

