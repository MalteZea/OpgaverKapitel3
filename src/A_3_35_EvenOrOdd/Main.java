package A_3_35_EvenOrOdd;
import java.util.Scanner;

/* (Even or odd number) Write a program that prompts the user to enter an integer and
displays whether the integer is an odd number or not. */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a whole number: ");
        int number = input.nextInt();

        int oddOrEven = number % 2;

        if (oddOrEven == 1) {
            System.out.println(number + " is an odd number");
        } else System.out.println(number + " is an even number");


    }
}
