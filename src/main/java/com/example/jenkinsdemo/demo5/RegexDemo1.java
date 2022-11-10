package com.example.jenkinsdemo.demo5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yaozeyu
 */
public class RegexDemo1 {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(".r");
        Matcher matcher = pattern.matcher("br");
        boolean results = matcher.matches();
        System.out.println(results);
    }
}
