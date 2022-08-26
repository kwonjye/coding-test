import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        sc.close();

        Integer[] arr = new Integer[N.length()];

        for(int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < N.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}
