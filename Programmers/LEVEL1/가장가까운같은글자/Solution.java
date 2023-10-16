package LEVEL1.가장가까운같은글자;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] arr = s.split("");
        answer[0] = -1;
        for(int i = 1; i < s.length(); i++) {
            for(int j = 0; j < i; j++) {
                if(arr[j].equals(arr[i])) {
                    answer[i] = i - j;
                    continue;
                }
            }
            if(answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }
}
