//**Class: StringsReverse
//* Sean-Michael Reid
//* @version 1.0
//* Course: ITEC 2140 Spring 2023
//* Written: March 13, 2023
//Write a program that accepts a String value from the user and displays the reverse of that value.

//Sample output for value "Hello, World!":
//Reverse of "Hello, World!" is "!dlroW ,olleH"

import java.util.Scanner;
public class StringReverse
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str = input.nextLine();

        char ch;
        String nstr = "";

        for (int i=0; i<str.length(); i++){
            ch= str.charAt(i);
            nstr= ch+nstr;
        }

        System.out.println("Reverse of "+str+" is "+nstr);

        if(str.equals(nstr)){
            System.out.println("String value "+str+" and its reverse "+nstr+" are equal");
        }
        else{
            System.out.println("String value "+str+" and its reverse "+nstr+" are not equal");
        }
    }
}

