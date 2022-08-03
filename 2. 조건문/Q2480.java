import java.util.Scanner;

public class Q2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        int result = 0;

        if(a == b && b == c) {
            result = 10000 + a * 1000;
        }else if(a == b || a == c) {
            result = 1000 + a * 100;
        }else if(b == c) {
            result = 1000 + b * 100;
        }else {
            result = Math.max(c, Math.max(a, b)) * 100;
        }

        System.out.println(result);

        sc.close();
    }
}
