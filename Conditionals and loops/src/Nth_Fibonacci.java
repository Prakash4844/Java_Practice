import java.util.Scanner;

public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no to calculate Fibonacci Series of those number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
//        }
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
