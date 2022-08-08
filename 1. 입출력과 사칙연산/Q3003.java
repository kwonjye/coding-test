import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        k = (k == 1) ? 0 : 1 - k;
        q = (q == 1) ? 0 : 1 - q;
        r = (r == 2) ? 0 : 2 - r;
        b = (b == 2) ? 0 : 2 - b;
        n = (n == 2) ? 0 : 2 - n;
        p = (p == 8) ? 0 : 8 - p;
        System.out.println(k + " " + q + " " + r + " " + b + " " + n + " " + p);
        sc.close();
    }
}