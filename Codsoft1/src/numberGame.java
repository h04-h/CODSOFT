import java.util.Scanner;
import java.util.Random;
public class numberGame {
    public static void main(String[] args) {
        int i =1;
        int score=0;
        System.out. println("This game consists of 3 rounds");
        do {
            System.out. println();
            System.out. println("Round :"+ i);
            System.out. println();
            Random random = new Random();
            int rand = random.nextInt(100) + 1;
            //System.out.println(rand); //put it to check the number
            System.out.println("Try to guess the number between 1 and 100:");
            System.out.println("You have 5 tries");
            Scanner scan = new Scanner(System.in);
            int guess = scan.nextInt();

            if (guess == rand) {
                System.out.println("You won from first try!!");
                score += 10;
            } else {
                int n;
                for (n = 1; n < 5; n++) {
                    if (guess > rand) {
                        System.out.println("too high");
                    } else
                        System.out.println("too low");

                    System.out.println("Try again:");
                    guess = scan.nextInt();
                    if (guess == rand) {
                        System.out.println("You won!!");
                        break;
                    }
                }

                if (n == 1)
                    score += 7;
                else if (n == 2)
                    score += 5;
                else if (n == 3)
                    score += 3;
                else if (n == 4)
                    score += 1;
                else
                    score += 0;
            }
            System.out.println("Your current score is " + score);
            i++;
        }while(i<=3);
        System.out. println("Your final score is: "+ score);
    }
}