package company;

import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 12");

        String userNumber = scan.nextLine();

        int n = scan.nextInt();
        String mon[] = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"};
        if (n > 12 || n < 1) {
            System.out.println("You have entered an invalid number. " +
                    "You must enter a number between 1 and 12. Goodbye.");
        } else {
            System.out.println(mon[n - 1]);
        }
    }
}
