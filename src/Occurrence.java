//**Class: Occurrence
//* Sean-Michael Reid
//* @version 1.0
//* Course: ITEC 2140 Spring 2023
//* Written: March 13, 2023

//Write a program that prompts the user for a String value and a character value. The program should then find the last occurrence of the provided character in the provided String and display the corresponding index. If the character is not found in the String, display -1.

//Sample output for values "Hello, World!" and 'l':
//Last occurrence of character 'l' in "Hello World" is at index 10

//Sample output for values "Hello, World!" and 'g':
//Last occurrence of character 'g' in "Hello World" is at index -1
import java.util.Scanner;
public class Occurrence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Enter a character: ");
        char c = input.next().charAt(0);
        int index = -1;

        for(int i=0; i<str.length(); i++) {

            if(str.charAt(i) == c) {
                index = i+1;
            }
        }
        System.out.print("Last occurrence of character '"+c+"' in '"+str+"' is at index "+index);
    }
}
