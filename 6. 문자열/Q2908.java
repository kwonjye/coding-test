import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        StringBuffer sbA = new StringBuffer(A);
        StringBuffer sbB = new StringBuffer(B);
        String reA = sbA.reverse().toString();
        String reB = sbB.reverse().toString();
        if(Integer.parseInt(reA) > Integer.parseInt(reB)) System.out.println(reA);
        else System.out.println(reB);
    }
}
