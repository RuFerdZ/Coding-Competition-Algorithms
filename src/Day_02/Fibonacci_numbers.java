package Day_02;

import java.util.Scanner;

public class Fibonacci_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp1 = 0;
        int temp2 = 1;
        while (temp1<=num)
        {
            if(temp2>num){
                System.out.print(temp1);
            }else {
                System.out.print(temp1 + ", ");
            }
            int tot = temp1 + temp2;
            temp1 = temp2;
            temp2 = tot;

        }
    }
}
