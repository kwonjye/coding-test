import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        if(N == 1) System.out.println(1);
        else {
            int a = 6;
            int b = 0;
            int num = 1;
            while(num < N) {
                b++;
                num += a * b;
            }
            System.out.println(b + 1);
        }
    }
}
