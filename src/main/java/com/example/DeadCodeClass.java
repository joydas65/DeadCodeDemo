package com.example;

public class DeadCodeClass {

    public void doNothing() {
        // This method is never called
        System.out.println("This is dead code.");
    }
    
    public int unusedCalculation(int x, int y) {
        // An unused method
        return x + y;
    }
}
