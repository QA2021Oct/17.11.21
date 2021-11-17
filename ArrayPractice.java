package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1:
        int my_array [] ={1,2,3,4,5,6,7,8,9,10};  // 1+2+3+4+5+6+7+8+9+10
        int shum = 0;

        for (int i = 0; i < my_array.length; i++){
            //shum = shum + i;
            shum += my_array[i];
        }

        System.out.println("shum is: " + shum);


//2:
        float numbers [] = {20, 16.5f, 35, 17, 60, 70};
        //System.out.println(numbers.length);
        float sum = 0;


        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        float avg = sum / numbers.length;
        System.out.println("The average is: " + avg);
        // shum / orech

        //3:
        Scanner s = new Scanner(System.in);
        // array
        // value - from user    3
        // for - go over the array
        // if - array[i] == value
        int array [] = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1456, 1472, 2365, 1456, 2265, 1457, 2456};
        System.out.println("Enter year: ");
        int element = s.nextInt();
        boolean exist = false; //

        for(int i = 0; i < array.length; i++){
            //System.out.println(array[i]);
            if(element == array[i]){
                exist = true;
            }
        }
        if(exist == true){
            System.out.println(element + " exist");
        }else{
            System.out.println(element + " Not exist");
        }

        //4:
        int array2 [] =  {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Enter a number: ");
        int value= s.nextInt();
        boolean exist2 = false;

        for(int i= 0; i < array2.length; i++ ){
            if(array2[i] == value){
                System.out.println(value + " in index num-" + i);
                exist2 = true;
            }
        }
        if (exist2 == false){
            System.out.println(value + " is not exist in the array");
        }

        //5:
        int array3 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i= array3.length-1 ; i >= 0; i--){ // array[10]  - array[9]  //  for(int i= array3.length-1 ; i > -1; i--)
            System.out.print(array3[i] + ", ");
        }
    }
}
