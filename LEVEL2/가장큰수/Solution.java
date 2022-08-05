package LEVEL2.가장큰수;

import java.util.*;

public class Solution {
    public String solution(int[] numbers) {
        String[] stringNumbers = new String[numbers.length];
        
        // int형 배열 -> String형 배열
        for(int i = 0; i < numbers.length; i++) {
            stringNumbers[i] = Integer.toString(numbers[i]); 
        }
        
        // 두 수를 번갈아가며 합친 수 중 큰 값을 앞으로 정렬(내림차순)
        Arrays.sort(stringNumbers, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        if(stringNumbers[0].equals("0")) return "0";
        
        return String.join("", stringNumbers);
    }
}
