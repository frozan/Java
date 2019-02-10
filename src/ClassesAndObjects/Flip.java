package ClassesAndObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Flip {
    public static void main (String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        Random coin = new Random();
        int count = 0, heads = 0, tails = 0;
        int num_flips, flip_result;

        System.out.println("Enter the number of flips: ");
        System.out.flush();
        num_flips = Integer.parseInt(stdin.readLine());
        while (count <= num_flips) {
            flip_result = Math.abs(coin.nextInt()) % 2;
            if (flip_result == 0)
                heads = heads + 1;
            else
                tails = tails + 1;
            count = count + 1;
        }
        System.out.println("The number of heads are: " + heads);
        System.out.println("The number of tails are:" + tails);
    }
}
