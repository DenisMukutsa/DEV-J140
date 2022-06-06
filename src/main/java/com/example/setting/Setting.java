/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.setting;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author Denis
 */
public class Setting {
    Properties properties;

    public final static String URL = "url";
    public final static String USE = "use";
    public final static String PASS = "pass";

    public Setting() {
        properties = new Properties();
        File file = new File("com.example.setting.prop");
        try {
            if(!file.exists())
                file.createNewFile();
            properties.load(new FileReader(file));
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public String getValue(String key){
        String value = properties.getProperty(key);
        return value;
    }
}
