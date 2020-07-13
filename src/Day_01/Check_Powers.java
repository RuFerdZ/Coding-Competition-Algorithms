package Day_01;

import java.util.Scanner;

public class Check_Powers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num != 0 && ((num & (num - 1)) == 0));
    }
}
