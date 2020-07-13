package Day_01;

import java.util.Scanner;

public class Leap_Years {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int count = 20;

        while(count>0){
            year++;
            if (year%4==0){
                if(year%400==00){
                    if (count==1){
                        System.out.println(year);
                    }else {
                        System.out.print(year + ",");
                    }
                    count--;
                }else if(year%100==00){
                    continue;
                }else{
                    if (count==1){
                        System.out.println(year);
                    }else {
                        System.out.print(year + ",");
                    }
                    count--;
                }
            }
        }
    }
}
