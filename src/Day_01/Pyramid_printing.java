package Day_01;

import java.util.Scanner;

public class Pyramid_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int stars = 0; stars<num ; stars++){

            for (int space=num-stars ; space>1; space--){
                System.out.print(" ");
            }

            for (int star=0; star<=stars; star++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
