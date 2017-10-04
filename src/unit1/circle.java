package unit1;

import codehs.ConsoleProgram;

public class circle extends ConsoleProgram {
    public void run(){

        int r;
        double circumference;
        r = readInt("The r of the circle is ");
        circumference = r*2*Math.PI;
        System.out.println("The circumference is " + circumference);
    }
}
