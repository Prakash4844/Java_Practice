import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
/*
* Java supports the usual logical conditions from mathematics:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
You can use these conditions to perform different actions for different decisions.

* java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
*
* if else Syntax
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
* Syntax if else-if else
 if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
* */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        int salary = input.nextInt();

        if (salary>10000){
            // block of code to be executed if condition1 is true
            System.out.println("Salary with bonus is: " + (salary+2000));
        } else {
            // block of code to be executed if the condition1 is false
            System.out.println("Salary with bonus is: " + (salary+1000));
        }

        if (salary>10000) {
            // block of code to be executed if condition1 is true
            System.out.println("Salary with bonus is: " + (salary+4000));

        } else if (salary>10000) {
            // block of code to be executed if the condition1 is false and condition2 is true
            System.out.println("Salary with bonus is: " + (salary+3000));

        } else {
            // block of code to be executed if the condition1 is false and condition2 is false
            System.out.println("Salary with bonus is: " + (salary+1500));

        }
    }
}