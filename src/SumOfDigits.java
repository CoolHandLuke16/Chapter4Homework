//**Class: SumOfDigits
//* Sean-Michael Reid
//* @version 1.0
//* Course: ITEC 2140 Spring 2023
//* Written: March 13, 2023


//This class; Write a program that accepts an integer from the user and displays
//the sum of the digits of the provided integer.

import java.util.Scanner;

public class SumOfDigits

{

    public static int SumOfDigits(int val) {

        int sum = 0;

        while (val != 0) {

            sum = sum + val % 10;

            val = val / 10;

        }

        return sum;

    }

    public static void main(String args[])

    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int n = input.nextInt();

        System.out.println("\nSum of all digits is " + SumOfDigits(n));

    }

}

