package LEVEL0.문자열계산하기;

class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length - 1; i += 2) {
            if(arr[i].contains("+")) {
                answer += Integer.parseInt(arr[i+1].trim());
            }else {
                answer -= Integer.parseInt(arr[i+1].trim());
            }
        }
        return answer;
    }
}