package programs;

public class Animals extends Vetenery {
    public static void main(String[] args) {
        Animals an=new Animals();
        an.vaccination();
        an.legs();
        an.tail();
    }
    void legs(){
        System.out.println("All animals have 4 legs");
    }
    void tail(){
        System.out.println("All animals have one tail");
    }
}
