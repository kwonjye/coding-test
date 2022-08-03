package LEVEL2.일이사나라의숫자;

class Solution {
    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";
        
        int num = n;
        
        while(num > 0) {
            int remainder = num % 3;
            num /= 3;
            
            if(remainder == 0) num--;
            
            answer = numbers[remainder] + answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(4));
    }
}