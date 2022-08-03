import java.util.Scanner;

public class Q1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        String result = "";
        
        if(A > B) {
            result = ">";
        }else if(A < B) {
            result = "<";
        }else {
            result = "==";
        }
        System.out.println(result);

        sc.close();
    }
}
