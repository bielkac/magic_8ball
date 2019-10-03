package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declare
        Scanner keyboard;
        int firstNumber;
        keyboard = new Scanner(System.in);
        System.out.println(" Choose a number between 1-100");
        firstNumber = keyboard.nextInt();
        if (10 >= firstNumber && firstNumber > 0) {
            System.out.println("uncertain");
        }
        else if(20>=firstNumber && firstNumber>10) {
            System.out.println("not likely");
        }
        else if (30>= firstNumber && firstNumber>20){
            System.out.println(" negative outcome ");
        }
        else if (40>=firstNumber && firstNumber>30){
            System.out.println(" unfortunately");
        }
        else if (50>=firstNumber  && firstNumber>40){
            System.out.println("try again");
        }
        else if (60>=firstNumber && firstNumber>50){
            System.out.println(" positive outcome");
        }
        else if (70>=firstNumber && firstNumber>60){
            System.out.println(" well likely");
        }
        else if (80>=firstNumber && firstNumber>70){
            System.out.println("most certain");
        }
        else if (90>=firstNumber && firstNumber>80){
            System.out.println("yes");
        }
        else if (100>=firstNumber && firstNumber>90){
            System.out.println("Without a doubt");
        }




 }}