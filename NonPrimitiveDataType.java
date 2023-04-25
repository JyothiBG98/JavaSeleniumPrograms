package DataTypes;

public class NonPrimitiveDataType {
    public static void main(String[] args) {

        //Arrays
        int[] a=new int[10];
        int[] b=new int[20];
        a[0]= 10;
        a[1]=20;
        a[3]=30;
        a[4]=40;
        a[5]=50;
        b[0]= 10;
        b[1]=20;
        b[3]=30;
        b[4]=40;
        b[5]=50;
        System.out.println(a[1]+b[2]);
        System.out.println(a[5]+b[5]);
    }
}
