package LEVEL3.N으로표현;

public class Solution {

    static int min = 9;

    public int solution(int N, int number) {
        dfs(0, N, number, 0);

        if(min == 9) return -1;
        return min;
    }

    public void dfs(int depth, int N, int number, int current) {
        if(depth > 8) { // 8보다 클 경우 min의 값은 변동없으므로 -1 return
            return;
        }

        if(number == current) { // number가 현재 값인 current와 같을 경우
            min = Math.min(depth, min); // 기존에 저장된 min과 depth 중 더 작은 값을 min에 저장
        }

        int temp = 0;

        for(int i = 0; i < 8; i++) {
            if(depth + i < 8) {
                temp = temp * 10 + N; // 5, 55, 555, 5555, ...
                dfs(depth + i + 1, N, number, current + temp);
                dfs(depth + i + 1, N, number, current - temp);
                dfs(depth + i + 1, N, number, current / temp);
                dfs(depth + i + 1, N, number, current * temp);
            }
        }
    }
}
