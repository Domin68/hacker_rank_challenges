package com.projects;

import java.util.HashMap;
import java.util.Map;

public class SignMap {
    private Map<Character, String> stringMap = new HashMap<>();

    public void setStringMap(Map<Character, String> stringMap) {
        this.stringMap = stringMap;
        stringMap.put('A', ".-");
        stringMap.put('B', "-...");
        stringMap.put('C', "-.-.");
        stringMap.put('D', "-..");
        stringMap.put('E', ".");
        stringMap.put('F', "..-.");
        stringMap.put('G', "--.");
        stringMap.put('H', "....");
        stringMap.put('I', "..");
        stringMap.put('J', ".---");
        stringMap.put('K', "-.-");
        stringMap.put('L', ".-..");
        stringMap.put('M', "--");
        stringMap.put('N', "-.");
        stringMap.put('O', "---");
        stringMap.put('P', ".--.");
        stringMap.put('Q', "--.-");
        stringMap.put('R', ".-.");
        stringMap.put('S', "...");
        stringMap.put('T', "-");
        stringMap.put('U', "..-");
        stringMap.put('V', "...-");
        stringMap.put('W', ".--");
        stringMap.put('X', "-..-");
        stringMap.put('Y', "-.--");
        stringMap.put('Z', "--..");
        stringMap.put('1', ".----");
        stringMap.put('2', "..--");
        stringMap.put('3', "...--");
        stringMap.put('4', "...-");
        stringMap.put('5', ".....");
        stringMap.put('6', "-....");
        stringMap.put('7', "--...");
        stringMap.put('8', "---..");
        stringMap.put('9', "----.");
        stringMap.put('0', "-----");
    }

    public void translate(String sign) {
        setStringMap(stringMap);
        sign = sign.toUpperCase();
        for (int i = 0; i < sign.length(); i++) {
            System.out.print(stringMap.get(sign.charAt(i))+ " ");
        }


    }
}
