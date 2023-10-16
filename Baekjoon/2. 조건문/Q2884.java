import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int aHour = hour;
        int aMinute = minute;

        if(minute >= 45) {
            aMinute -= 45;
        }else if(hour > 0) {
            aHour -= 1;
            aMinute += 15;
        }else {
            aHour = 23;
            aMinute += 15;
        }

        System.out.println(aHour + " " + aMinute);

        sc.close();
    }
}
