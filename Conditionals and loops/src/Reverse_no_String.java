// Reverse a no. using string
//
import java.util.Scanner;

public class Reverse_no_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        StringBuilder rev = new StringBuilder();
        while (num > 0) {
            long rem = num%10;
            rev = rev.append(rem);
            num = num/10;
        }
        System.out.println("Reverse of the number is: "+rev);
    }
}
