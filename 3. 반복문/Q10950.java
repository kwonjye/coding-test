import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++) {
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());
            System.out.println(A+B);
        }
        
        sc.close();
    }
}
