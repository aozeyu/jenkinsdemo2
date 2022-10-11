package com.example.jenkinsdemo.demo2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtils {
    /**
     * 获取当前时间所在月的每一天
     *
     * @param date {@link Date}
     * @return {@link List < String>}
     * @author Kang Yong
     * @date 2022/10/11
     */
    public static List<String> getDayListOfMonth(Date date) {
        List<String> resultList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 从1号开始
        int day = calendar.getActualMaximum(Calendar.DATE);
        for (int i = 1; i <= day; i++) {
            String dateStr = String.valueOf(year) + "-" + month + "-" + i;
            resultList.add(dateStr);
        }
        return resultList;
    }
}
