package unit1;

import codehs.ConsoleProgram;

public class Hours extends ConsoleProgram {
    @Override
    public void run() {
        double hours;
        double dot;
        double day;
        double hour;
        hours = readDouble("what is the hour ");
        hour = hours%24;
        day = (hours-hour)/24;
        System.out.print("the time is " + day);
        System.out.print(" day ");
        System.out.print(hour);
        System.out.print(" hours");

    }
}
