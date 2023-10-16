import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();

        int n = 1;
        int num = 1;
        while(X != 1) {
            n++;
            if(n % 2 == 0) {
                num += 1;
                if(Math.abs(num - X) <= n - 1 && X >= num) break;
            }else {
                num += (n / 2) * 4;
                if(Math.abs(num - X) <= n - 1 && X <= num) break;
            }
        }
        if(num == X) {
            System.out.println("1/" + n);
        }else {
            int m = Math.abs(num - X);
            System.out.println((1 + m) + "/" + (n - m));
        }
    }
}
