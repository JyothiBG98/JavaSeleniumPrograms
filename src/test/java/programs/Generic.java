package programs;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Generic {
    public static String firstName(){
        Faker faker = new Faker(new Locale("en-IND"));;
        return faker.name().firstName();
    }
    public static String emailID(){
        Faker faker = new Faker(new Locale("en-IND"));;
        return faker.name().firstName()+"@testmail.com";
    }
    public static String mobileNUumber(){
        Faker faker = new Faker(new Locale("en-IND"));;
        return faker.number().digits(10);
    }
    public static String companyName(){
        Faker faker = new Faker(new Locale("en-IND"));;
        return faker.company().name();
    }

}
