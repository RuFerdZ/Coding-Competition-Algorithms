package Day_01;

import java.util.Scanner;

public class Print_a_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int stars = 1; stars<=num ; stars++){
            for(int star = 1; star<=stars ; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
