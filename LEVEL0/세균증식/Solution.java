package LEVEL0.세균증식;

class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer = n * (int)Math.pow(2, t);
        return answer;
    }
}