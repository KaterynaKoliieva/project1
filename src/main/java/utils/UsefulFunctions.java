package utils;

import dataProvider.ConfigFileReader;

import java.sql.Timestamp;
import java.util.Random;


public class UsefulFunctions {

    public static int randomNumber(int size){
        Random random = new Random();
        return random.nextInt(size);
    }

    public static String randomName(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime() + ConfigFileReader.getName();
    }

    public static String email= randomName() + "@test.com";
    public static String firstName = randomName();
    public static String lastName = randomName();
    public static String password = randomName();
    public static String fullName = firstName + " " + lastName;

}
