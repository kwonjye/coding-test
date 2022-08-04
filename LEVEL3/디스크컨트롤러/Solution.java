package LEVEL3.디스크컨트롤러;

import java.util.*;

public class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]); // 요청 시점 순 정렬
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]); // 소요시간 순 정렬
        
        int idx = 0,    // 인덱스
            count = 0,  // 처리된 디스크
            time = 0;   // 작업이 끝난 시간(누적)
        
        while(count < jobs.length) {
            // 진행된 시간보다 작은 jobs를 heap에 넣어줌
            while(idx < jobs.length && jobs[idx][0] <= time) {
                heap.add(jobs[idx++]);
            }
            if(heap.isEmpty()) {
                time = jobs[idx][0];
            }else {
                int[] tmp = heap.poll();
                answer += tmp[1] + time - tmp[0];
                time += tmp[1];
                count++;
            }
        }
        return answer / jobs.length;
    }
}
