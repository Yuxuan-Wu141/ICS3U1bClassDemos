package unit1;

import codehs.ConsoleProgram;

public class Minute extends ConsoleProgram {
    @Override
    public void run() {
        int minutes;
        int minute;
        int day;
        int daydot;
        int hour;
        minutes = readInt("what is the minutes ");
        day = minutes/1440;
        daydot = minutes%1440;
        hour = daydot/60;
        minute = minutes-day*1440-hour*60;
        System.out.print("the time is " + day);
        System.out.print(" day ");
        System.out.print(hour);
        System.out.print(" hours");
        System.out.print(minute);
        System.out.print(" minutes");

    }
}