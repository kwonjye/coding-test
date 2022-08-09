import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        int[] count = new int[26];
        int max = 0;
        int maxIndex = 0;

        for(int i = 0; i < s.length(); i++) {
            count[(int)s.charAt(i) - 65]++;
        }

        for(int i = 0; i < count.length; i++) {
            if(max < count[i]) {
                max = count[i];
                maxIndex = i;
            }else if(max == count[i]) {
                maxIndex = -1;
            }
        }

        if(maxIndex == -1) {
            System.out.println("?");
        }else {
            System.out.println((char)(maxIndex + 65));
        }
        sc.close();
    }
}
