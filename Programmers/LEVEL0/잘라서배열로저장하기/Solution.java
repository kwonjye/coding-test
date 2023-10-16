package LEVEL0.잘라서배열로저장하기;

class Solution {
    public String[] solution(String my_str, int n) {
      int index = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
      int a = 0;
            String[] answer = new String[index];                                   
            for(int i = 0; i <= answer.length-1; i++) {              
                 if(i != answer.length-1) {
                     answer[i] = my_str.substring(a, a+n);
                     a += n;               
                 }else if(i == answer.length-1) {
                     answer[i] = my_str.substring(a);                    
                 }                               
            }                                         
            return answer;
    }
}