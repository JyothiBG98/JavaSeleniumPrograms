package programs;

public class PatternProgram {

    public static void main(String args[]) {//driver function
PatternProgram pat=new PatternProgram();

      int i, j, row = 6;
        for (i=0; i<row ;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }pat.leftHandTringle(5);
    }

public void leftHandTringle(int rows) {

    System.out.println("## Printing the pattern ##");
    for (int i = 1; i <= rows; i++)
    {
        for (int j = rows; j > i; j--)
        {
            System.out.print("  ");
        }

        for (int k = 1; k <= i; k++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

}}