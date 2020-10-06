package com.abergaz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class.getName());
    public static void main(String[] args) {
        try {
            // ContextInitializer.CONFIG_FILE_PROPERTY is set to "logback.configurationFile"
            //System.setProperty(ContextInitializer.CONFIG_FILE_PROPERTY, "/path/to/config.xml");

            Start.start(args);
        }catch (Exception e){
            Start.end(e);
        }
    }
}
