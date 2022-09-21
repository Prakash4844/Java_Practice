package Zaphkiel;

public class TypePromotion {
    public static void main(String[] args) {
        //      Automatic type promotion in expression
        byte r = (byte)(300); // here we are getting 300 % 256 = 44 //Because 256 is max value a byte can hold
        System.out.println(r);

        byte a = 20;
        byte b = 30;
        byte c = 30;
        int d = ( a * b ) / c; //here a, b and c are promoted to int in expression
//        The result of a * b exceeds the range of byte. To handle this kind of problem,
//                Java automatically promotes each byte or short operand to int. a * b is performed using integers.

//        Here are the Type Promotion Rules:
//
//        All byte and short values are promoted to int.
//                If one operand is a long, the whole expression is promoted to long.
//                If one operand is a float, the entire expression is promoted to float.
//                If any of the operands is double, the result is double.

        System.out.println(d);

        System.out.println(3* 5.8676); //promotes to double
        System.out.println(3* 5.387296438658f); //promotes to float

        byte h = 42;
        char g = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double j = 0.1234;
        double result = (f * h) + (i / g) + (j * s);

        System.out.println((f * h) +" "+ (i / g) +" "+ (j * s));
        //        (f*h) is converted to float as float is of largest of two datatype
        //        (i/g) is converted to int as int is of largest of two datatype
        //        (j*s) is converted to double as double is of largest of two datatype
        // float + int - double = double
        System.out.println(result);

//        byte e = 67;
//        e = e * 2; //won't work as expression are evaluated on ints
//        System.out.println(e);
    }
}
