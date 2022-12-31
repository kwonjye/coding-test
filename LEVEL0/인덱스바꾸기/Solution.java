package LEVEL0.인덱스바꾸기;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        char c = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = c;
        return new String(arr);
    }
}