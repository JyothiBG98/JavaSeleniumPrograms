package programs;

public class forLoop {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }
        String names[]={"Aravind","Jyothi","Janu","Druthi","Shresta"};
        for(String ref:names){
            if(ref=="Manu") {
                System.out.println(ref);}

            }


            System.out.println("Name not found");

        }
    }

