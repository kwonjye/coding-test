import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int copyN = N;
        int count = 0;
        while(true) {
            N = ((N % 10) * 10 + ((N % 10) + (N / 10)) % 10);
            count++;
            if(N == copyN) break;
        }
        System.out.println(count);
        sc.close();
    }
}
