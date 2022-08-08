import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String result = Integer.toString(A * B * C);
        for(int i = 0; i <= 9; i++) {
            int count = 0;
            for(int j = 0; j < result.length(); j++) {
                if(result.charAt(j) - '0' == i) count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
