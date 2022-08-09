import java.util.Scanner;

public class Q1065 {
    static int arithmetic_sequence(int N) {
        int count = 0;
        if(N < 100) {
            return N;
        }else {
            count = 99;
            for(int i = 100; i <= N; i++) {
                int three = i / 100;
                int two = (i / 10) % 10;
                int one = i % 10;

                if((three - two) == (two - one)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(arithmetic_sequence(sc.nextInt()));
        sc.close();
    }
}
