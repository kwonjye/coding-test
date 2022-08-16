import java.util.Scanner;

public class Q4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0) {
            int count = 0;
            for(int i = n + 1; i <= 2 * n; i++) {
                if(i == 1) continue;
                boolean isPrime = true;
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) count++; 
            }
            if(count > 0) {
                System.out.println(count);
            }
            n = sc.nextInt();
        }
        sc.close();
    }
}
