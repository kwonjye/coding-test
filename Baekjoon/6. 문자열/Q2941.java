import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        s = s.replaceAll("c=", " ");
        s = s.replaceAll("c-", " ");
        s = s.replaceAll("dz=", " ");
        s = s.replaceAll("d-", " ");
        s = s.replaceAll("lj", " ");
        s = s.replaceAll("nj", " ");
        s = s.replaceAll("s=", " ");
        s = s.replaceAll("z=", " ");
        System.out.println(s.length());
    }
}
