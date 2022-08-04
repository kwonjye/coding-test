package LEVEL3.야근지수;

import java.util.*;

public class Solution {
    public long solution(int n, int[] works) {
        // 우선순위 큐를 사용하여 남은 작업량이 큰 순서대로 작업
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : works) {
            pq.offer(i);
        }
        
        // n만큼 작업량을 1씩 빼줌
        for(int i = 0; i < n; i++) {
            int max = pq.poll();
            if(max <= 0) break; // 제일 큰 수가 0인 경우 남은 일의 작업량이 없으므로 break
            pq.offer(max-1);
        }
        
        long sum = 0;
        while(!pq.isEmpty()) { // 작업량이 남아있는 경우
            sum += Math.pow(pq.poll(), 2); // 제곱해서 야근 지수 합산
        }
        return sum;
    }
}
