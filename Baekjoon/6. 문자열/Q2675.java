import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int R = Integer.parseInt(sc.next());
            String S = sc.next();
            String result = "";
            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    result += S.charAt(j);
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
