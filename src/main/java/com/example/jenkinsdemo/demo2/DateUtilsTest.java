package com.example.jenkinsdemo.demo2;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

public class DateUtilsTest {
    @Test
    public void testGetDayListOfMonth2 () {
        List<String> list = DateUtils.getDayListOfMonth(new Date());
        list.forEach(System.out::println);
    }
}
