package com.other_package_continuation;


public class SillyTimeFormatChanger {
    public static void main(String[] args) {
        String s = "12:05:45AM";
        timeConversion(s);


    }

    static String timeConversion(String s) {
        if (s.equals("12:00:00AM")) {
            s = "00:00:00";
        }else if (s.equals("12:00:00PM")) {
            s = "12:00:00";
        }else if(s.startsWith("12")&& s.endsWith("AM")){
            StringBuffer strBuff = new StringBuffer(s);
            strBuff.delete(strBuff.length() - 2, strBuff.length());
            strBuff.replace(0,2,"00");
            s = strBuff.toString();
        }
        if (s.endsWith("AM")) {
            StringBuffer strBuff = new StringBuffer(s);
            strBuff.delete(strBuff.length() - 2, strBuff.length());
            s = strBuff.toString();
        }
        if (s.startsWith("12") && s.endsWith("PM")){
            StringBuffer strBuff = new StringBuffer(s);
            strBuff.delete(strBuff.length() - 2, strBuff.length());
            s = strBuff.toString();
        }else if (s.endsWith("PM")) {
            StringBuffer strBuff = new StringBuffer(s);
            StringBuffer noAa = new StringBuffer(strBuff);
            noAa.delete(noAa.length() - 2, noAa.length());
            noAa.delete(0, 2);
            StringBuffer hour = new StringBuffer(strBuff);
            hour = hour.delete(2, hour.length());
            int numberHour = Integer.parseInt(hour.toString()) + 12;
            noAa.insert(0, numberHour);
            s = noAa.toString();
        }

        System.out.println(s);
        return s;
    }
}
//12:00:00PM
//00:00:00