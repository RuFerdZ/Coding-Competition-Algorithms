import java.util.Scanner;

public class WeNeedYourHelp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Question 1: Were the round 1 questions easy?");
        String ans1 = sc.nextLine().toLowerCase();
        String ans2 = "";
        if (ans1.equals("y") || ans1.equals("yes")){
            ans2 = sc.nextLine().toLowerCase();
        }

        if (ans1.equals("y") || ans1.equals("yes")){
            System.out.println("That’s great!");
//            System.out.println("Question 2: Do you think you will be selected to round 2?");

            if (ans2.equals("y") || ans2.equals("yes")) {
                System.out.println("We wish you the best of luck!");
            }else {
                System.out.println("Don’t lose hope!");
            }
        }else{
            System.out.println("Keep practicing!");
        }
    }
}
