package com.mycompany.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App
{

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    private final static String message = "Hello World!";

    App() {}

    public static void main(String[] args) {
        LOGGER.info(new App().getMessage());
    }

    private String getMessage() {
        return message;
    }

}
