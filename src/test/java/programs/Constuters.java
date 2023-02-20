package programs;

public class Constuters {
    public static void main(String[] args) {
        Constuters con=new Constuters();
        Constuters co=new Constuters("jyothi");

    }
    public Constuters(){
        System.out.println("This is constucter");
    }
    public Constuters(String name){

        System.out.println("Name: "+name);
    }
}
