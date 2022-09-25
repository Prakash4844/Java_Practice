import java.util.Scanner;

public class Char_Case_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is in lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is in uppercase");
        } else {
            System.out.println("The character is not an alphabet");
        }
    }
}
