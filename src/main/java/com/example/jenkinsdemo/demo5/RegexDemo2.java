package com.example.jenkinsdemo.demo5;

import java.util.regex.Pattern;

/**
 * @author yaozeyu
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        boolean result = Pattern.matches(".r","ar");
        System.out.println(result);
    }
}
