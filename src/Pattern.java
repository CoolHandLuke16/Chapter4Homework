//**Class: Pattern
//* Sean-Michael Reid
//* @version 1.0
//* Course: ITEC 2140 Spring 2023
//* Written: March 13, 2023
//Write a program that creates the following pattern.

//******
//*****
//****
//***
//**
//*

public class Pattern {
    public static void main(String[] args) {
        //declaring number of rows
        int rows = 6;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


