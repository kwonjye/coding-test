package LEVEL0.칠의개수;

import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        answer = str.length() - str.replace("7", "").length();
        return answer;
    }
}