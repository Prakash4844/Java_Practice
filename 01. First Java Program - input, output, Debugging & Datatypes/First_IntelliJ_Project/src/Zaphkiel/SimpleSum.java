package Zaphkiel;

import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers separated by space or return key: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        System.out.println("sum of two given numbers is: " + (num1+num2));
    }
}
