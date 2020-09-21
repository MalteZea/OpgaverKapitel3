package A_3_5_FindFutureDates;

/* (Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the current day of the week as an integer." +
                " Sunday is 0 and Saturday is 6:");

        int weekDay = input.nextInt();

        System.out.print("Please input a number and you will be shown the day of the week, that many days forward:");

        int futureDay = input.nextInt();

        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday" , "Thursday", "Friday", "Saturday"};

        int theDay = (weekDay + futureDay) % 7;

        System.out.println("Today is " + days[weekDay] + " and " + futureDay + " days forward the day of the week will be a " + days[theDay]);
    }
}
