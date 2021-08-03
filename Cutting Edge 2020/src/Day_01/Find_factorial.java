package Day_01;

import java.util.Scanner;

public class Find_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;

        for(int val = 1 ; val<= num ; val++){
            factorial = factorial * val;
        }
        System.out.println(factorial);
    }
}
