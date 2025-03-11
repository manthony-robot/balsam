package com.balsam.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleLogger {
    // Enum for log levels
    public enum LogLevel {
        INFO, ERROR, DEBUG, WARN
    }

    // Method to log messages
    public static void log(LogLevel level, String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(timestamp + " [" + Thread.currentThread().getName() + "] " + level + " - " + message);
    }

    // Convenience methods
    public static void info(String message) {
        log(LogLevel.INFO, message);
    }

    public static void error(String message) {
        log(LogLevel.ERROR, message);
    }

    public static void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public static void warn(String message) {
        log(LogLevel.WARN, message);
    }
}
