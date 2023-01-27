package programs;

public class StringExamples {
    public static void main(String[] args) {
        //To print message using String variable.
        String name=" Jyothi is a software Engineer. ";
        System.out.println(name);

        //To count characters in a string.
        System.out.println(name.length());

        //To print particular index.
        System.out.println(name.charAt(15));

        //To convert Uppercase and Lowercase from given string.
        System.out.println(name.toUpperCase());

        //Replace method to particular character by specified character.
        System.out.println(name.replace("o","$"));

        //Check whether the string contains given sequence.
        System.out.println(name.contains("Software Developer"));

        //To check string start with which prefix.
        System.out.println(name.startsWith("Jyo"));

        //To check suffix.
        System.out.println(name.endsWith("er"));

        //To check equality.
        System.out.println(name.equals("jyothi"));

        //Ignore method to ignore case sensitive.
        System.out.println(name.equalsIgnoreCase(" jyothi is a software developer "));

        //Excluding extra space at 1st and last .
        System.out.println(name.trim().length());

        //To check blank String.
        System.out.println(name.isEmpty());

        //Split the string using delimeter.
        String name1=name.split(" ")[0];
        String name2=name.split(" ")[1];
        String name3=name.split(" ")[2];
        String name4=name.split(" ")[3];
        String name5=name.split(" ")[4];
        String name6=name.split(" ")[5];
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        System.out.println(name6);


    }
}
