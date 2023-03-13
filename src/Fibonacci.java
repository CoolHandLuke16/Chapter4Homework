//**Class: Fibonacci
//* Sean-Michael Reid
//* @version 1.0
//* Course: ITEC 2140 Spring 2023
//* Written: March 13, 2023
//Write a program that prints the first 30 values in the Fibonacci series.
//A Fibonacci series begins with 0 and 1.
//The next number is then found by adding the previous two numbers.
//The first few numbers in the Fibonacci series are: 0,1,1,2,3,5,8,13 and so on.

public class Fibonacci {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.print(num1);
        System.out.print(", ");
        System.out.print(num2);
        System.out.print(", ");


        int i = 2;
        while(i<30){
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            if(num3 == 514229 )
                System.out.print(514229);
            else if (num3 !=514229)
                System.out.print(num3+ ",");

            i += 1;{

                System.out.println();



            }
        }
    }
}


