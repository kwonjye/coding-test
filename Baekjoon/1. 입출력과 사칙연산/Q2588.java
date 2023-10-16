import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        String strNum = Integer.toString(B);
        int [] arrNum = new int[strNum.length()];
        for(int i = 0; i < strNum.length(); i++) {
            arrNum[i] = strNum.charAt(i) - '0';
        }

        for(int i = arrNum.length - 1; i > -1; i--) {
            System.out.println(A * arrNum[i]);
        }
        System.out.println(A*B);

        sc.close();
    }
}
