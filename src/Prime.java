//**Class: Prime
//* Sean-Michael Reid
//* @version 1.0
//* Course: ITEC 2140 Spring 2023
//* Written: March 13, 2023
//Write a program that prompts the user for an integer and displays if the provided integer is a prime number or not. A prime number is a number that is divisible only by 1 and itself. First few prime numbers are 2,3,5,7,11,13 and so on. Sample run is shown below

//Sample output for value of 51:
//51 is not a prime number

//Sample output for value of 83:
//83 is a prime number
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean isPrime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}

