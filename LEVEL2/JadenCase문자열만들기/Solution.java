package LEVEL2.JadenCase문자열만들기;

public class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        char[] charArr = s.toCharArray();
        if(!Character.isDigit(charArr[0])) {
            charArr[0] = Character.toUpperCase(charArr[0]);
        }
        for(int i = 1; i < charArr.length; i++) {
            if(charArr[i] == ' ') {
                if(i != charArr.length - 1 && charArr[i+1] != ' ' && !Character.isDigit(charArr[i+1])) {
                    charArr[i+1] = Character.toUpperCase(charArr[i+1]);
                }
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }
}
