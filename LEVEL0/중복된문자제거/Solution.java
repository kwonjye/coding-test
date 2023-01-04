package LEVEL0.중복된문자제거;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            String a = String.valueOf(my_string.charAt(i));
            if(!answer.contains(a)) {
                answer += a;
            }
        }
        return answer;
    }
}