import java.util.Scanner;

public class Q10870 {
    static int[] arr = new int[21];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        arr[0] = 0;
        arr[1] = 1;
        fibonacci(2, n);
        System.out.println(arr[n]);
    }

    public static void fibonacci(int n, int m) {
        arr[n] = arr[n-1] + arr[n-2];
        if(n < m) {
            fibonacci(n + 1, m);
        }
    }
}
