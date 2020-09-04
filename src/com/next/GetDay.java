package com.next;

import java.text.*;
import java.util.*;


public class GetDay {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */


    public static String findDay(int month, int day, int year) {
        String dayy = (month) + "." + (day) + "." + (year);
        SimpleDateFormat form = new SimpleDateFormat("MM.dd.yyyy");
        Date date = new Date();
        try {
            date = form.parse(dayy);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dayOfWeek = "";
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        switch (cal.get(Calendar.DAY_OF_WEEK) - 1) {
            case 0 -> dayOfWeek = "Sunday";
            case 1 -> dayOfWeek = "Monday";
            case 2 -> dayOfWeek = "Tuesday";
            case 3 -> dayOfWeek = "Wednesday";
            case 4 -> dayOfWeek = "Thursday";
            case 5 -> dayOfWeek = "Friday";
            case 6 -> dayOfWeek = "Saturday";
        }
        System.out.println(dayOfWeek);
        return dayOfWeek.toUpperCase();
    }

    public static void main(String[] args) {
        findDay(9, 5, 2015);

    }
}
