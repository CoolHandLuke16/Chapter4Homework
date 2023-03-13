//**Class: AverageGrade
//* Sean-Michael Reid
//* @version 1.0
//* Course: ITEC 2140 Spring 2023
//* Written: March 13, 2023
//calculates and displays the average grade in the class.
//The user should enter a character to stop providing values.

//Sample out for student grades [20, 40, 55, 17, 67, c]:
//Average student grade is 39.8
import java.util.Scanner;
public class AverageGrade {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        double average = 0.0;
        int count = 0;
        System.out.println("Enter grades or character to stop!");
        /* loop runs until enter a character */
        while (true) {

            String inp = input.next();
            double num = 0;
            try {
                num = Double.parseDouble(inp);
                average += num;
                count++;
            } catch (Exception E) {

                break;
            }
        }
        /* compute average and display the average grade */
        average = average / count*1.0;
        System.out.println("Average student grade is " + average);
    }
}

