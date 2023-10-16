import java.util.Scanner;

public class Q10872 {
    static int factorial = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        multiple(N);
    }

    public static void multiple(int N) {
        if(N == 0) {
            System.out.println(factorial);
        }else {
            factorial *= N;
            multiple(N-1);
        }
    }
}
