package programs;
import java.util.*;
public class switchStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the day :");
        int number=scan.nextInt();
        switch (number){
            case 0:System.out.println("Sunday");
            break;
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("saturday");
            break;
            default:System.out.println("Enter correct number to show a day");
            break;
        }
    }
}
