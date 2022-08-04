import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        for(int i = 0; i < N; i++) {
            int A = Integer.parseInt(sc.next());
            if(A < X) System.out.print(A + " ");
        }
        sc.close();
    }
}
