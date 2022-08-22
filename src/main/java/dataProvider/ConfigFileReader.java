package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private static Properties properties;
    private final String propertyFilePath= "configs//Configuration.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }

    }
        public String getApplicationUrl() {
            String url = properties.getProperty("screwfix_url");
            if(url != null) return url;
            else throw new RuntimeException("url is not specified in the Configuration.properties file.");
            }

        public String getDefaultTime() {
            String text = properties.getProperty("default_time");
            if(text != null) return text;
            else throw new RuntimeException("default_time is not specified in the Configuration.properties file.");
        }

        public String enteredText() {
            String text = properties.getProperty("text");
            if(text != null) return text;
            else throw new RuntimeException("text is not specified in the Configuration.properties file.");
        }

        public String getEnteredText() {
            String text = properties.getProperty("expected_result");
            if(text != null) return text;
            else throw new RuntimeException("expected_result is not specified in the Configuration.properties file.");
        }

        public String getEnteredEmail() {
            String text = properties.getProperty("email");
            if(text != null) return text;
            else throw new RuntimeException("email is not specified in the Configuration.properties file.");
        }

        public String getEnteredPassword() {
            String text = properties.getProperty("password");
            if(text != null) return text;
            else throw new RuntimeException("password is not specified in the Configuration.properties file.");
        }

        public String getSignInText() {
            String text = properties.getProperty("sign_in");
            if(text != null) return text;
            else throw new RuntimeException("sign_in is not specified in the Configuration.properties file.");
        }
        public static String getName() {
            String text = properties.getProperty("name");
            if(text != null) return text;
            else throw new RuntimeException("name is not specified in the Configuration.properties file.");
        }

        public static String getPostcode() {
            String text = properties.getProperty("postcode");
            if(text != null) return text;
            else throw new RuntimeException("postcode is not specified in the Configuration.properties file.");
        }


    }

