package programs;
import java.util.*;
public class AddDidits {
    /*
    Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. Go to the editor

    Test Data
    Input an integer between 0 and 1000: 565
    Expected Output :
    The sum of all digits in 565 is 16
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to add all the digits in integer: ");
        int number= 555;
        int sum=0;
        int firstDigit=number%10;
        int remainingDigit=number/10;
        int secondDigit=remainingDigit%10;
        remainingDigit=remainingDigit/10;
        int thirdDigit=remainingDigit%10;
        sum=firstDigit+secondDigit+thirdDigit;


        System.out.println("The sum of Integer is :"+sum);


    }
}
