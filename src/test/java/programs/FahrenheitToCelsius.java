package programs;
import java.util.*;
public class FahrenheitToCelsius {
    /*
    Write a Java program to convert temperature from Fahrenheit to Celsius degree.
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
        double f=scan.nextDouble();
         double c;
         c=((5*(f-32))/9 );
         System.out.println("The temperature in celsius is :"+c);
    }
}
