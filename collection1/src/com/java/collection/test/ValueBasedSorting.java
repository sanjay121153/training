package com.java.collection.test;

import java.util.*;
import java.util.stream.Collectors;

public class ValueBasedSorting {
    public static void main(String as[]) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("4", "D");
        map.put("5", "E");
        map.put("6", "F");

        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Map<String, String> hashmap = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : list) {
            hashmap.put(entry.getKey(), entry.getValue());
        }


        //using java8
        list.stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

    }



}
