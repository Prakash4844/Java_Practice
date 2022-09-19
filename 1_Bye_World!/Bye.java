public class Bye {
    public static void main(String[] args) {
        System.out.println(args[2]);
        System.out.println("Bye");
    }
}

//In Java, every application begins with a class name, and that class must match the filename.

/* Every line of code that runs in Java must be inside a class. In our example, we named the class Main. 
A class should always start with an uppercase first letter.

Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning. 

System is a built-in Java class that contains useful members, such as out, 
which is short for "output". The println() method, short for "print line", is used to print a value to the screen (or a file).

String[] args inside the main(String[] args) are command line arguments, You can provide the command line argument when running the 
java bytecode like this:

Compile by: 
$ javac Bye.java

Give Command Line Argument when Running/interpreting Byte Code:
 $ java Bye This is Endgame

Output: 
$ Endgame
$ Bye

 Here in This code we use "System.out.println(args[2]);" Which specify to print string from Command Line Arguments that is at 2nd index. 
*/