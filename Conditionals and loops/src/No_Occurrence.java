import java.util.Scanner;

public class No_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        System.out.print("Enter a digit to find its occurrence: ");
        int n = sc.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = (int)(num % 10);
            if (rem == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(n+" Occurs "+count+" times");
    }
}
