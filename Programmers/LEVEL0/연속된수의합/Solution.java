package LEVEL0.연속된수의합;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middle = total / num;
        int start = 0;
        if(total % num == 0) {
            start = middle - num / 2;
        }else {
            start = middle - num / 2 + 1;
        }
        for(int i = 0; i < answer.length; i++) {
            answer[i] = start++;
        }
        return answer;
    }
}