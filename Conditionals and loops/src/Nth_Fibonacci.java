import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no to calculate Fibonacci Series of those number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
//        if (n == 1) {
//            System.out.println("0");
//        } else if (n == 0) {
//            System.out.println("No Fibonacci Series for 0");
//        } else {
//            System.out.print(a + " " + b + " ");
//        }
        for (int i = 2; i < n; i++) {
            c = a + b;
//            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
