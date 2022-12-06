package com.SLOC;

public class MainClass {
    public static void main(String[] args) {
        LOC locObj = new LOC();
        String file = "LOC.java";

        locObj.start(String.join(" ", file).trim());
        System.out.println(locObj.toString());
    }
}
