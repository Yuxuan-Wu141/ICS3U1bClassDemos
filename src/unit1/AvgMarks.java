package unit1;

import codehs.*;

public class AvgMarks extends ConsoleProgram{
    public void run(){
        //Create mark1, mark2, mark3, mark4 variables
        double mark1;
        double mark2;
        double mark3;
        double mark4;
        //Create avg variable
        double avg;
        //Get valus for mark1, mark2, mark3, mark4 from user input
        mark1 = readDouble("Enter mark 1:");
        mark2 = readDouble("Enter mark 2:");
        mark3 = readDouble("Enter mark 3:");
        mark4 = readDouble("Enter mark 4:");
        //Compute avg = (mark1 + mark2 + mark3 + mark4)/4
        avg = (mark1 + mark2 + mark3 + mark4)/4;
        //Output avg to the screen
        System.out.print("Average mark is ");
        System.out.print(avg);
    }
}








