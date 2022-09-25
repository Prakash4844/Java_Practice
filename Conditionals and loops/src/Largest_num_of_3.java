import java.util.Scanner;

public class Largest_num_of_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Three number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));
        // Math.max() method returns the greater of two int values. and we have used it as input again
        // in Math.max() method
        // so it resolves to the greater of num2 and num3 and then compares that with num1.
        System.out.println("The largest number is: " + max);
    }
}
