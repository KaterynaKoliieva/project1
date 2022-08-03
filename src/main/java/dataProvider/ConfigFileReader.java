package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
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
            String url = properties.getProperty("url");
            if(url != null) return url;
            else throw new RuntimeException("url not specified in the Configuration.properties file.");
        }

        public String enteredText() {
            String text = properties.getProperty("text");
            if(text != null) return text;
            else throw new RuntimeException("text not specified in the Configuration.properties file.");
        }

    public String getEnteredText() {
        String text = properties.getProperty("expected_result");
        if(text != null) return text;
        else throw new RuntimeException("expected_result not specified in the Configuration.properties file.");
    }
    }

