package Day1;

import java.util.Random;
import java.util.Scanner;
//猜数字小游戏
public class p52Random {
    public static void main(String[] args) {
        Random r = new Random();
        int RandomNum = r.nextInt(100) + 1;//[1,100]

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please input a number between 1 and 100");
            int guessNum = scanner.nextInt();

            if (RandomNum > guessNum) {
                System.out.println("too low");

            } else if (RandomNum < guessNum) {
                System.out.println("too big");

            } else {
                System.out.println("right");
              break;
            }
        }

    }
}
