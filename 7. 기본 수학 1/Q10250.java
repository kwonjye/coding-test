import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int H = Integer.parseInt(sc.next());
            int W = Integer.parseInt(sc.next());
            int N = Integer.parseInt(sc.next());

            int a = 0;
            int b = 0;
            if(N % H > 0) {
                a = N % H;
                b = N / H + 1;
            }else {
                a = H;
                b = N / H;
            }

            if(b < 10) {
                System.out.println(a + "0" + b);
            }else {
                System.out.println(a + "" + b);
            }
        }
        sc.close();
    }
}
