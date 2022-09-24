public class Loops {

    public static void main(String[] args) {
        // While Loop
// The while loop, loops through a block of code as long as a specified condition is true:

// Syntax
//    while (condition) {
//        // code block to be executed
//    }
// In the example below, the code in the loop will run, over and over again,
// as long as a variable (i) is less than equal to 5:
//
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

    // Do While Loop
// The do/while loop is a variant of the while loop. This loop will execute the code block once,
// before checking if the condition is true, then it will repeat the loop as long as the condition
// is true.

// Syntax
//    do {
//        // code block to be executed
//    }while (condition);

// In the example below, the code in the loop will run, at least once, even if the condition is false,
// because the code block is executed before the condition is tested:
    i = 0;
    do {
        System.out.println(i);
        i++;
    } while (i <= 5);

    // For Loop
// When you know exactly how many times you want to loop through a block of code,
// use the for loop instead of a while loop:

// for (statement 1; statement 2; statement 3) {
//      code block to be executed
// }
//
// Statement 1 is executed (one time) before the execution of the code block.
// Statement 2 defines the condition for executing the code block.
// Statement 3 is executed (every time) after the code block has been executed.

  for (i = 0; i <= 5; i++) {
      System.out.println(i);
    }
}
}

