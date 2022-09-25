import java.util.Scanner;


public class Reverse_no_wo_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        long rev = 0;
        while (num > 0) {
            long rem = num%10;
            rev = rev*(10) + rem;
            num = num/10;
        }
        System.out.println("Reverse of the number is: "+rev);
    }
}
