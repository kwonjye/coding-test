package LEVEL2.전화번호목록;

import java.util.*;

public class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }
        
        // 하나씩 문자열을 잘라서 map에 해당 문자열이 있는지 확인(접두어가 있는지)
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0,j)))
                    return false;
            }
        }
        return true;
    }
}
