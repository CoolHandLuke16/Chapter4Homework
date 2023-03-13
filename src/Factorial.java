//**Class: Factorial
//* Sean-Michael Reid
//* @version 1.0
//* Course: ITEC 2140 Spring 2023
//* Written: March 13, 2023

//Write a program that prompts the user for an integer value.
//The program should then calculate and print the factorial of the user provided value.
//Factorial of a number, n, written as n! is calculated as a product of all integers less than or equal to n. 5! = 5*4*3*2*1 = 120. 0! = 1. 1! = 1.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Declaration of integer variables
        int n,fact=1;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        //Taking an integer input from user
        //And, storing it into the variable n
        n = input.nextInt();

        //for loop which will iterate for i=1 to i<=n
        //for ex; take n=5
        //So, the loop will run for i=1 to i<=5
        //In the first iteration, i=1
        //So, fact becomes fact*i = 1*1 = 1
        //In the second iteration, i=2
        //So, fact becomes fact*i = 1*2 = 2
        //In the third iteration, i=3
        //So, fact becomes fact*i = 2*3 = 6
        //In the fourth iteration, i=4
        //So, fact becomes fact*i = 6*4 = 24
        //In the fifth iteration, i=5
        //So, fact becomes fact*i = 24*5 = 120
        //Now, in the next iteration i=6
        //So, condition(i<=5) becomes false
        //So, loop will terminate
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }

        //Printing factorial of the number entered by the user
        System.out.println("The factorioal of the provided integer is: " +fact);
    }
}

