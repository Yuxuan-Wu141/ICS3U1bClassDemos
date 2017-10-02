package unit1;

import codehs.ConsoleProgram;

public class Hypotenuse extends ConsoleProgram {

    public void run(){
        //Create variables for sideA, sideB, hypothenuse
        double sideA;
        double sideB;
        double hypothenuse;
        double hypSqrd;

        //get values for sideA, sideB
        sideA = readDouble("Enter the length of sideA");
        sideB = readDouble("Enter the length of sideB");

        //Compute hypotenuse
        hypSqrd = Math.pow(sideA,2) + Math.pow(sideB,2);
        hypothenuse = Math.sqrt(hypSqrd);

        //Output
        System.out.println("The hypothenuse is ");
        System.out.println(hypothenuse);


    }
}
