package LEVEL0.암호해독;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = code - 1; i < cipher.length(); i += code) {
            answer += String.valueOf(cipher.charAt(i));
        }
        return answer;
    }
}