package LEVEL0.OX퀴즈;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2].trim());
            int c = Integer.parseInt(arr[4].trim());
            int r = 0;
            if(arr[1].equals("+")) {
                r = a + b;
            }else {
                r = a - b;
            }
            answer[i] = r == c ? "O" : "X";
        }
        return answer;
    }
}