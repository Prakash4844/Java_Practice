package Zaphkiel;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //here we are making an obj of Scanner
                                                    // that will be used for rest of the Program
        System.out.print("Enter your name: ");
        String name = input.next(); //only take first word as input
        System.out.println("Your name is: " + name);

        System.out.print("Enter your Full name: ");
        String fullName = input.nextLine(); //takes whole line as input
        System.out.println("Your name is: " + fullName);

        System.out.print("Input your rollno: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no. is: " + rollno);

        System.out.print("Input amount: ");
        int money = input.nextInt();  //ex. 250_000_000; //In terms of money '_' can be used to separate 0s
        // But '_' can only work in code and not as an input
        System.out.println("current balance is $: " + money);

        System.out.print("Enter your height in feet.inch: ");
        float height = input.nextFloat();
        System.out.println("Your height in feet.inch is: " + height);

    }
}
