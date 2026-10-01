package org.example;

import java.util.*;

public class Task3 {
    static void main(){
        String text = "java is great java is powerful " +
                "python is great too but java is java";
        int N = 3;

        String[] words = text.toLowerCase().split(" ");

        Map<String, Integer> popular = new HashMap<>();

        for (String word : words) {
            if(popular.containsKey(word)){
                popular.put(word, popular.get(word)+1);
            } else {
                popular.put(word, 1);
            }
        }

        List<String> result = new ArrayList<>(popular.keySet());

        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {

                if (popular.get(result.get(j)) > popular.get(result.get(i))) {

                    String temp = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, temp);
                }
            }
        }

        System.out.println(result.subList(0, N));
    }
}
