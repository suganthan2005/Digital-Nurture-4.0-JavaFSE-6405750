package com.singleton;

public class Logger {
    
    private static Logger loggerinstance;

    
    private Logger() {
        System.out.println("Logger Initialized");
    }

    
    public static Logger getInstance() {
        if (loggerinstance == null) {
            loggerinstance = new Logger();
        }
        return loggerinstance;
    }

    
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
