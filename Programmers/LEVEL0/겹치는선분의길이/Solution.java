package LEVEL0.겹치는선분의길이;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200];
        for(int i = 0; i < 3; i++) {
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                arr[j]++;
            }
        }
        for(int i = 0; i < 200; i++) {
            if(arr[i] > 1) answer++;
        }
        return answer;
    }
}