import java.util.Scanner;

public class Q4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for(int i = 0; i < C; i++) {
            int N = Integer.parseInt(sc.next());
            int[] arr = new int[N];
            double sum = 0.0;
            for(int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(sc.next());
                sum += arr[j];
            }
            double avg = sum / N;
            double count = 0;
            for(int k = 0; k < N; k++) {
                if(arr[k] > avg) count++;
            }
            System.out.println(String.format("%.3f", (count / N) * 100) + "%");
        }
        sc.close();
    }
}
