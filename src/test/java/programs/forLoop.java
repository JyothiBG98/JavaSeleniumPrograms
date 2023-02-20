package programs;

public class forLoop {
    public static void main(String[] args) {
        /*
        Syntax for forloop
        for(initialisation; condition statement; increment/decrement )
         */
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }

        /*
        To check whether the given name is found or not.
         */
        String names[]={"Aravind","Jyothi","Janu","Druthi","Shresta"};
        /*
        Syntax for foreach loop
        for(data type reference variable:array name)
         */
        for(String ref:names){
            if(ref=="Manu") {
                System.out.println(ref);}

            }


            System.out.println("Name not found");

        }
    }

