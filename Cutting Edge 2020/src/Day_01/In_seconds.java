package Day_01;

import java.util.Scanner;

public class In_seconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();

        int seconds = hour*60*60;

        System.out.println("Seconds:" + seconds);
    }
}
