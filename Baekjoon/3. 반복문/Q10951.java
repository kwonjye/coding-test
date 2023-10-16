import java.util.Scanner;

public class Q10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());
            System.out.println(A + B);
        }
        sc.close();
    }
}
