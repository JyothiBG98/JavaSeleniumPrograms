package programs;
import java.util.*;
public class InchesToMeter {
    /*
    Write a Java program that reads a number in inches, converts it to meters. Go to the editor
    Note: One inch is 0.0254 meter.
    Test Data
    Input a value for inch: 1000
    Expected Output :
    1000.0 inch is 25.4 meters
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number in inches: ");
        double inch= scan.nextDouble();
        double meter;
        meter=inch *0.0254;
        System.out.println(inch+" inch is "+meter+" meters");

    }
}
