//**Class: CompareStrings
//* Sean-Michael Reid
//* @version 1.0
//* Course: ITEC 2140 Spring 2023
//* Written: March 13, 2023
//Write a program that prompts the user for two String values.
//The program should then display if string 1 is greater in length than string 2.
//The program should also display if string 1 appears after string 2 in the lexicographic order or vice versa or if they are the same.
//Lastly, the program should display a sentence created by combining both the string values.

import java.util.Scanner;
public class CompareStrings
{
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two srings: ");

        str1 = input.nextLine();
        str2 = input.nextLine();

        if(str1.length()>str2.length()){
            System.out.println("String "+str1+" is longer than String "+str2);
        }
        else if(str1.length()<str2.length()){
            System.out.println("String "+str2+" is longer than String "+str1);
        }
        else{
            System.out.println("String "+str1+" is equal in length to String "+str2);
        }

        if (str1.compareTo(str2) < 0) {
            System.out.println("String "+str1+" appears before String "+ str2+" in lexicographic order");
        } else if (str1.compareTo(str2) == 0) {
            System.out.println(str1 + " is equal to " + str2);
        } else {
            System.out.println("String "+str2+" appears before String "+ str1+" in lexicographic order");
        }

        System.out.println("New sentence created is "+str1+" "+str2);
    }
}
