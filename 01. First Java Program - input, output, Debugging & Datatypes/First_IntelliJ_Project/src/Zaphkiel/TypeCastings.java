package Zaphkiel;

import java.util.Scanner;

public class TypeCastings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextInt(); //You can take int value in float variables
                                        //Here Implicit typecasting is taking place

//        int num2 = input.nextFloat(); //You can't take float value in int variables

//        Explicit conversion
        int num2 = (int)(69.69);

        System.out.println(num1+" "+num2);
    }
}
//    type casting is a method or process that converts a data type into another data type in both ways manually and
//        automatically. The automatic conversion is done by the compiler and manual conversion performed by the
//        programmer.

// Type casting are of two type: (1)Implicit casting(widening casting).
                                                                // Converting a lower data type into a higher
                                                                //  one is called widening type casting.
                                                                //  it is also known as implicit conversion
                                                                //  or casting down. It is done automatically.

//                               (2)Explicit Casting(narrowing casting).
                                                    //        Converting a higher data type into a
                                                    //        lower one is called narrowing type casting.
                                                    //        It is also known as explicit conversion or casting up.
                                                    //        It is done manually by the programmer.
                                                    //        If we do not perform casting then the
                                                    //        compiler reports a compile-time error.

//Implicit Casting are safe as there is no loss of data.
//Order: byte -> short -> char -> int -> long -> float -> double

//Explicit Casting are safe as there is no loss of data.
//Order: double -> float -> long -> int -> char -> short -> byte


/* Conditions for Implicit(Automatic) type-casing
* 1. Types should be compatible.
* 2. Destination Datatype should be larger than Source Datatype.
* */
