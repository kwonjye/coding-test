package LEVEL0.한번만등장한문자;

import java.util.*;
class Solution {
    public String solution(String s) {
        ArrayList<Character> list = new ArrayList<>();
        String a = s;
        for(int i = 0; i < s.length(); i++) {
            int count = a.length() - a.replace(String.valueOf(s.charAt(i)), "").length();
            a = s;
            if(count == 1) {
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        return String.join("", list);
    }
}