package company;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {

       Scanner scan= new Scanner(System.in);

        System.out.println("Please input 5 numbers separated by spaces");


        String[] nums = new String[5];

        for (int i= 0; i <nums.length; i++) {
            nums[i] =scan.nextLine();

            System.out.println("The numbers you entered are: ");

            System.out.println(nums[0]);



        }
    }
}
