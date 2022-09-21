package Zaphkiel;

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temp in Celsius: ");
        float tempC = input.nextFloat();

        float tempF = tempC * 1.8f + 32;
        System.out.println("Temperature in Fahrenheit is "+tempF);
    }
}
