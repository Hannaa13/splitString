package com.company;

import java.util.HashMap;

public class CountMap {

    String[] arr;

    public HashMap<String, Integer> count(String text) {
        arr = text.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
                for (String str : arr) {
                if (map.containsKey(str)) {
                    int j= map.get(str);
                    j++;
                    map.put(str, j);
                } else {
                    map.put(str, 1);
                }
            }

            return map;

    }


}
