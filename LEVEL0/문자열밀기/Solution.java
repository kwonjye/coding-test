package LEVEL0.문자열밀기;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int j = 0;
        if(A.equals(B)) {
            return 0;
        }
        for(int i = 0; i < A.length(); i++) {
            A = String.valueOf(A.charAt(A.length() - 1)) + A.substring(0, A.length() - 1);
            j++;
            if(A.equals(B)) answer = j;
        }
        return answer;
    }
}