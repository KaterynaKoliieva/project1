package utils;

import manager.PageFactoryManager;
import java.sql.Timestamp;
import java.util.Random;


public class UsefulFunctions {

    public static int randomNumber(int size){
        Random random = new Random();
        return random.nextInt(size);
    }

    public static String randomName(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime() + PageFactoryManager.configFileReader.getName();
    }

    public static String email= randomName() + "@test.com";
    public static String firstName = randomName();
    public static String lastName = randomName();
    public static String password = randomName();
    public static String fullName = firstName + " " + lastName;

    public static String passwordOfTheRegisteredUser = PageFactoryManager.configFileReader.getEnteredPassword();
    public static String emailOfTheRegisteredUser = PageFactoryManager.configFileReader.getEnteredEmail();

}
