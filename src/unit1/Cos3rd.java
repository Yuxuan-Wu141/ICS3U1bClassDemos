package unit1;

import codehs.ConsoleProgram;

public class Cos3rd extends ConsoleProgram{
    @Override
    public void run() {
        double a;
        double b;
        double c;
        double angle;
        a = readDouble("the a side of triangle is ");
        b = readDouble("the b side of triangle is ");
        angle = readDouble("the angle of triangle is ");
        angle = Math.toRadians(angle);
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2)-2*a*b*Math.cos(angle));
        System.out.println("The c side of the triangle is " + c);
    }
}
