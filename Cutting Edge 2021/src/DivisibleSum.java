import java.util.Scanner;

public class DivisibleSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

// answer
        long prod = 1;
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            prod *= i;
            sum += i;
        }
        if (prod % sum == 0) {
            System.out.println("YEAH");
        } else {
            System.out.println("NAH");
        }

    }
}
