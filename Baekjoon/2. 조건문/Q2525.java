import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.next());
        int minute = Integer.parseInt(sc.next());
        int time = sc.nextInt();

        int eHour = hour;
        int eMinute = minute;

        if(minute + time >= 60) {
            eHour += (minute + time) / 60;
            if(eHour > 23) eHour -= 24;
            eMinute = (minute + time) % 60;
        }else {
            eMinute += time;
        }

        System.out.println(eHour + " " + eMinute);

        sc.close();
    }
}
