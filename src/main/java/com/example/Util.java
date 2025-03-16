package com.example;

public class Util {

    // Active method: used by ActiveService
    public static String activeUtilityMethod(String input) {
        return "Processed: " + input;
    }

    // Dead method: not used anywhere
    public static String deadUtilityMethod(String input) {
        return "Unused: " + input;
    }

    // Another dead method
    public static int computeUnusedValue() {
        return 42;
    }
}
