import java.util.Scanner;

public class Q1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        sc.close();
        
        if(C <= B) System.out.println(-1);
        else System.out.println((A/(C-B)) + 1);
    }
}