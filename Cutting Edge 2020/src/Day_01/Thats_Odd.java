package Day_01;

import java.util.Scanner;

public class Thats_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num + " is EVEN");
        }else {
            System.out.println(num + " is ODD");
        }
    }
}
