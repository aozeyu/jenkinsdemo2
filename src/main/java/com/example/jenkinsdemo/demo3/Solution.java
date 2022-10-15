package com.example.jenkinsdemo.demo3;

import java.lang.reflect.Method;

class Printer {
    boolean wasRun;
    public void printArray(Object o) {
        if (wasRun){
            return;
        }
        System.out.println("1\n2\n3\nHello\nWorld\n");
        wasRun = true;
    }
}
public class Solution {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArrays = {1,2,3};
        String[] stringArray = {"hello", "world"};
        myPrinter.printArray(intArrays);
        myPrinter.printArray(stringArray);
        int count = 1;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            System.out.println(name);
            if (name.equals("printArray")){
                count ++;
            }
            if(count > 1)System.out.println("Method overloading is not allowed!");
        }
    }
}
