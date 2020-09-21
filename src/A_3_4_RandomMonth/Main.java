package A_3_4_RandomMonth;



/*Write a program that randomly generates an integer between 1
and 12 and displays the English month names January, February, . . . , December
for the numbers 1, 2, . . . , 12, accordingly.*/

public class Main {
    public static void main(String[] args) {

        int month = (int) (Math.random()*12);

        String [] months =  {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        System.out.println(months[month]);
    }
}
