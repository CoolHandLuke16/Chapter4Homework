//**Class: MaxMinGrades
//* Sean-Michael Reid
//* @version 1.0
//* Course: ITEC 2140 Spring 2023
//* Written: March 13, 2023
//Write a program that prompts the user for student grades and displays the highest and lowest grades in the class. The user should enter a character to stop providing values.

//Sample out for student grades [20, 40, 55, 17, 67, c]:
//Highest student grade is 67
//Lowest student grade is 17
import java.util.Scanner;

public class MaxMinGrades{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter as many student grades as you like. Enter a character to stop.");
        double grade = input.nextDouble();
        double minGrade = Double.MAX_VALUE;
        double maxGrade = Double.MIN_VALUE;
        while (true) {
            try {
                grade = input.nextDouble();
            } catch (Exception e) {
                //breaking if user enters
                break;
            }
            //checking if grade is less than minGrade
            // make grade as minGrade
            if (grade < minGrade)
                minGrade = grade;
            //checking if grade is greater than maxGrade
            // make grade as maxGrade
            if (grade > maxGrade)
                maxGrade = grade;
        }
        //printing the results
        System.out.println("The highest grade is: " + maxGrade);
        System.out.println("The lowest grade is: " + minGrade);

    }
}

