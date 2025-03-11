package com.balsam.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleLogger {
    // Enum for log levels
    public enum LogLevel {
        INFO
    }

    // Method to log messages
    public static void log(LogLevel level, String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(timestamp + " [" + Thread.currentThread().getName() + "] " + level + " - " + message);
    }

    // Info log level
    public static void info(String message) {
        log(LogLevel.INFO, message);
    }
}
