package company;

import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 5 words separated by spaces");

        String[] userWords = new String[5];

        for (int i = 0; i < userWords.length; i++) {

            userWords[i] = scan.nextLine();

            System.out.println("The words you entered are: ");

            System.out.println(userWords[0]);
        }
    }
}
