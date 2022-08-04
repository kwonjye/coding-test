package LEVEL3.이중우선순위큐;

import java.util.*;

public class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(String oper : operations) {
            if(oper.contains("I")) {
                String[] iNum = oper.split(" ");
                minHeap.add(Integer.parseInt(iNum[1]));
                maxHeap.add(Integer.parseInt(iNum[1]));
            }else if(oper.contains("D 1")) {
                if(!maxHeap.isEmpty()) {
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                }
            }else {
                if(!minHeap.isEmpty()) {
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                }
            }
        }
        int[] answer = new int[2];
        if(!minHeap.isEmpty()) {
            answer[0] = maxHeap.peek();
            answer[1] = minHeap.peek();
        }
        return answer;
    }
}
