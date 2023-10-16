import java.util.Scanner;

public class Q2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int result = 0;

        for(int i = 0; i < N; i++) {
            int number = i;
            int sum = i;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
