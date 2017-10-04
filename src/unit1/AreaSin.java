package unit1;

import codehs.ConsoleProgram;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class AreaSin extends ConsoleProgram {
    @Override
    public void run() {
        double a;
        double b;
        double angle;
        double area;
        a = readDouble("the a side of triangle is ");
        b = readDouble("the b side of triangle is ");
        angle = readDouble("the angle of triangle is ");
        angle = Math.toRadians(angle);
        area = (a*b*Math.sin(angle))/2;
        System.out.println("The area of the triangle is " + area);
    }
}
