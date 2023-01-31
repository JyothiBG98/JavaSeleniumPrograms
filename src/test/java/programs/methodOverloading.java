package programs;

public class methodOverloading {
    /* Method Overloading is a methods having a same name but diffrent data types.

     */
    void addNumbers(int a,int b)
    {
        int c=a+b;
        System.out.println("The sum of two number is: "+c);

    }
    void addNumbers(float a, float b){
        float c=a+b;
        System.out.println("The addition of two numbers is: "+c);
    }

    public static void main(String[] args) {
        methodOverloading ref=new methodOverloading();

        ref.addNumbers(5,6);
    }
}
