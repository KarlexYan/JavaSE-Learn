package com.KarlexYan.util;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {
    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('A' + i));
            list.add((char) ('a' + i));
        }
        String result = "";
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = rd.nextInt(list.size());
            char c = list.get(randomIndex);
            result = result + c;
        }

        int number = rd.nextInt(10);
        result = result + number;

        char[] arr = result.toCharArray();
        int index = rd.nextInt(arr.length);
        char temp = arr[4];
        arr[4] = arr[index];
        arr[index] = temp;
        String code = new String(arr);
        return code;
    }
}
