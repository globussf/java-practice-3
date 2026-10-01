package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    static void main(){
        List<Integer> nums = new ArrayList<>(List.of(4, 2, 7, 2, 9, 4, 1, 7, 3, 9));

        System.out.println(nums);

        List<Integer> numsNonRepeat = new ArrayList<>();
        Map<Integer, Integer> counter = new HashMap<>();

        for (int i: nums){
            if(numsNonRepeat.contains(i)){
                counter.put(i, counter.get(i)+1);
            } else {
                numsNonRepeat.add(i);
                counter.put(i, 1);
            }
        }
        System.out.println(numsNonRepeat);
        for(int i:numsNonRepeat){
            System.out.print(i + " - " + counter.get(i) + " раза, ");
        }
        System.out.println();

        int max = numsNonRepeat.get(0);
        int min = numsNonRepeat.get(0);

        for (int i = 0; i < numsNonRepeat.size()-1; i++){
            if (max < numsNonRepeat.get(i)){
                max = numsNonRepeat.get(i);
            } else if (min > numsNonRepeat.get(i)) {
                min = numsNonRepeat.get(i);
            }
        }
        System.out.println(min + ", " + max);

        float sum = 0;


        for (int i: numsNonRepeat){
            sum += i;
        }

        float avg = sum /numsNonRepeat.size();
        System.out.println(sum + ", " + avg);
    }
}
