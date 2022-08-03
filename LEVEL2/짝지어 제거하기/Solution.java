import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!stack.isEmpty()) {
                if(c == stack.peek()) {
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }else {
                stack.push(c);
            }
        }
        if(stack.isEmpty()) answer = 1;
        return answer;
    }
}
