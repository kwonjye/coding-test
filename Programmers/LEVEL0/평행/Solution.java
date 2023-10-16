package LEVEL0.평행;

import java.util.ArrayList;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> arr = new ArrayList<>();
        for(int i = 0; i < dots.length-1; i++) {
           for(int j = i+1; j < dots.length; j++) {
               // 기울기 = y값의 변화량 / x값의 변화량
               double tem = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
               // 기울기가 같은 값이 있는지 찾고 있다면 두 직선은 평행한 상태
               if(arr.contains(tem)) {
                   return 1;
               }else {
                   arr.add(tem);
               }
            }
        }
        return answer;
    }
}