package com.example.jenkinsdemo.demo5;

import java.util.Random;

public class IDUtil {
    //éæºIDçæ
    public static Long getRandomId() {
        Long millis = System.currentTimeMillis();
        Random random = new Random();
        int end = random.nextInt(99);
        String str = millis + String.format("%02d", end);

        Long id = new Long(str);
        return id;
    }
}
