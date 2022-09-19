package Zaphkiel;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        System.out.print("Input your rollno: ");

        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your roll no. is: " + rollno);
    }
}
