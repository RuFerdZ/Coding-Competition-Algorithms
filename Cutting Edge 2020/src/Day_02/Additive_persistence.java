package Day_02;

import java.util.Scanner;

public class Additive_persistence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println("additivePersistence(" + Integer.parseInt(num) + ") -> " + additivePersistence(num));
    }

    static int additivePersistence(String num)
    {
        if(num.length() == 1) //If the number is a single digit, we're done
            return Integer.parseInt(num);

        int sum = 0;

        for(int i = 0; i < num.length(); i++)
            sum += (num.charAt(i) - '0'); //Gets integer value of char, adds it to sum

        return additivePersistence(Integer.toString(sum));
    }
}
