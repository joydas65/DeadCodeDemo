package com.example;

public class ActiveService {

    public void performAction() {
        System.out.println("Performing active service action.");
        // Optionally use a utility method that's active
        String result = Util.activeUtilityMethod("input");
        System.out.println("Active utility result: " + result);
    }
}
