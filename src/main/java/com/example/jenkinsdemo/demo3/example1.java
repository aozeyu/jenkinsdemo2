package com.example.jenkinsdemo.demo3;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("first number");
        int a = myobj.nextInt();
        System.out.println("second number");
        int b = myobj.nextInt();

        int c = a + b;
        System.out.println(c);
    }
}
