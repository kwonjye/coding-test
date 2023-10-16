import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i = 0; i < N; i++) {
            String s = sc.next();
            boolean check[] = new boolean[26];
            boolean tmp = true;

            for(int j = 0; j < s.length(); j++) {
                int index = s.charAt(j)-'a';
                if(check[index]) {
                    if(s.charAt(j) != s.charAt(j-1)) {
                        tmp = false;
                        break;
                    }
                }else {
                    check[index] = true;
                }
            }
            if(tmp) count++;
        }
        sc.close();
        System.out.println(count);
    }
}
