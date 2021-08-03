package Day_02;

import java.util.LinkedList;
import java.util.Scanner;

public class Climb_the_stairs {
    private static LinkedList<Integer> ll = new LinkedList<Integer>(){{ add(1);add(2);}};

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        waysToClimb(num, "");
    }

    public static void waysToClimb(int n, String res) {
        if (ll.peek() > n)
            System.out.println(res);
        else {
            for (Integer elem : ll) {
                if(n-elem >= 0)
                    waysToClimb(n - elem, res + String.valueOf(elem) + " ");
            }
        }
    }
}
