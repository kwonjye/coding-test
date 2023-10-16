import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        while(A != 0 || B != 0) {
            System.out.println(A + B);
            A = Integer.parseInt(sc.next());
            B = Integer.parseInt(sc.next());
        }
        sc.close();
    }
}
