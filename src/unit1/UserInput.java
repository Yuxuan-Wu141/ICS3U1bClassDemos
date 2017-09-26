/*
 A general program template utilizing codehs ConsoleProgram.
 The main method and user input method have been abstracted
 for simplification.
 
 1) Change this description to appropriately describe the program
 2) Change the class name to match the file name
 3) Refer to documentation for configuring your program to run.
 
 @author: EDIT: yourName
 */

package unit1;    // EDIT: set to appropriate lesson unit for this program
import codehs.*;  // utilize all code in the codehs package


public class UserInput extends ConsoleProgram{  //EDIT: change the class name to match the file name

    public void run() {
        String name = readLine("Enter your name: "); //get the name
        int age = readInt("Enetr your age: "); // get the age
        double mark = readDouble("Enter your Mark: "); // get the mark
        boolean lucky = readBoolean("Have you been assigned a locker?(true/false): "); // get the locker assignment
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
        System.out.println("Locker Assignment: " + lucky);
    }
}