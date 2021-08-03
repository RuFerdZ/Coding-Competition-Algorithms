package Day_02;

import java.util.Scanner;

public class Happy_numbers {
    static int numSquareSum(int n)
    {
        int squareSum = 0;
        while (n!= 0)
        {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }

    static boolean isHappynumber(int n)
    {
        int slow, fast;
        slow = fast = n;
        do
        {
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));

        }while (slow != fast);

        return (slow == 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isHappynumber(n))
            System.out.println("happy(" + n + ") -> true");
        else
            System.out.println("happy(" + n + ") -> false");
    }
}
