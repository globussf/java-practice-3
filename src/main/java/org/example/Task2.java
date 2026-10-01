package org.example;

import java.util.*;

public class Task2 {
    static void main(){
        List<String> input = List.of(
                "listen", "silent", "enlist",
                "hello", "world",
                "cat", "act", "tac"
        );
        Map<String, List<String>> groups = new HashMap<>();

        for(String word:input){
            char[] letters = word.toCharArray();

            Arrays.sort(letters);

            String key = new String(letters);

            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(word);
        }
        List<List<String>> result = new ArrayList<>(groups.values());

        System.out.println(result);

    }
}
