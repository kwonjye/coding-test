package LEVEL0.A로B만들기;

import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] b = before.split("");
        String[] a = after.split("");
        Arrays.sort(b);
        Arrays.sort(a);
        if(Arrays.toString(b).equals(Arrays.toString(a))) {
            answer = 1;
        }
        return answer;
    }
}