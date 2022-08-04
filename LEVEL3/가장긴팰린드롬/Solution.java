package LEVEL3.가장긴팰린드롬;

public class Solution {
    public int solution(String s)
    {
        for(int i = s.length(); i > 0; i--) { // 팰린드롬 길이
            for(int j = 0; j + i <= s.length(); j++) { // 팰린드롬 검사 시작 위치
                boolean flag = true;
                for(int k = 0; k < i / 2; k++) { // 팰린드롬 검사 횟수
                    if(s.charAt(j + k) != s.charAt(j + i - k - 1)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) return i;
            }
        }
        return 1;
    }
}
