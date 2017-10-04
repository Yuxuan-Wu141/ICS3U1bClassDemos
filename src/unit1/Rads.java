package unit1;

import codehs.ConsoleProgram;

public class Rads extends ConsoleProgram{
    @Override
    public void run() {
        double degree;
        double rads;
        degree = readDouble("The degree is ");
        rads = Math.toRadians(degree)/Math.PI;
        System.out.print("The rads is " + rads);
        System.out.print("PI");
    }
}
