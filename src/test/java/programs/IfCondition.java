package programs;
import java.util.*;
public class IfCondition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your marks to check pass or fail: ");
        int marks=scan.nextInt();
        if(marks<35){
            System.out.println("Fail");

        }else{
            System.out.println("pass");
        }
    }
}
