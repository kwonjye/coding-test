package LEVEL0.옹알이1;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(babbling[i].contains(arr[j])) {
                    babbling[i] = babbling[i].replace(arr[j], " ");
                }
            }
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i].equals("")) answer++;
        }
        return answer;
    }
}