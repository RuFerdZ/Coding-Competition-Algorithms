package Day_01;

import java.util.Scanner;

public class Smallest_and_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];


        for(int num=0 ; num<10 ; num++){
            nums[num] = sc.nextInt();
        }

        int max = nums[0];
        int min = nums[0];

        for(int num : nums){
            if(num<min){
                min = num;
            }
            if (num>max){
                max = num;
            }
        }

        System.out.println("smallest number: " + min);
        System.out.println("largest number: " + max);
    }
}
