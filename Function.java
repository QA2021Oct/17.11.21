package com.company;

public class Main {

    public static void main(String[] args) {
        // functions for ordering Salad in restaurant
        //Call method call_Waiter()
        call_Waiter();
        Order$();
        make00();
        picke();
        serve();
    }
    // Create call_Waiter function
    static void call_Waiter(){
        String waiter = "Gabi";
        System.out.println("Einat called the waiter");
        if (waiter == "Gabi"){
            System.out.println("Gabi is Ok");
        }
    }

    static  void Order$(){
        System.out.println("Ordered Salad");
    }

    static void make00(){
        System.out.println("Making the Salad");
    }

    static void picke(){
        System.out.println("waiter picked the Salad");
    }

    static  void serve(){
        System.out.println("serve the salad");
    }

}

