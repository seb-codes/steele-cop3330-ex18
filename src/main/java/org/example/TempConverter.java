/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;

import java.lang.*;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double c_temp = 0.0;
        double f_temp = 0.0;

        Scanner scan = new Scanner(System.in);
        Scanner double_scan = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit. ");
        String choice = scan.nextLine();


        System.out.println("Your choice: "+choice);

        if(choice.equals("C") | choice.equals("c")){

            System.out.print("Please Enter the Temperature in Fahrenheit: ");
            f_temp = double_scan.nextDouble();
            c_temp = (f_temp - 32) * (5/9);
            System.out.print(String.format("The temperature in Celsius is %.02f.", c_temp));
        }
        else if(choice.equals("F")| choice.equals("f")){
            System.out.print("Please Enter the Temperature in Celsius: ");
            c_temp = double_scan.nextDouble();
            f_temp = (c_temp * (9/5))+32;
            System.out.print(String.format("The temperature in Fahrenheit is %.02f.", f_temp));
        }
        else{
            System.out.println("YOU MESSED UP A-ARON");
        }

    }
}
