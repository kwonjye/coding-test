package LEVEL0.가까운수;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int abs = Math.abs(array[0] - n);
        for(int i = 1; i < array.length; i++) {
            if(abs > Math.abs(array[i] - n))  {
                answer = array[i];
                abs = Math.abs(array[i] - n);
            }else if(abs == Math.abs(array[i] - n)) {
                answer = array[i] < answer ? array[i] : answer;
            }
        }
        return answer;
    }
}