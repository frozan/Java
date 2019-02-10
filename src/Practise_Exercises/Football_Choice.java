package Practise_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Football_Choice {
    final static int HEADS = 1;
    final static int RECEIVE = 1;

    public static void main (String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 1 for HEADS or 2 for TAILS: ");
        int coin = Integer.parseInt(stdin.readLine());
        System.out.println("Enter 1 to RECIEVE or 2 for KICKOFF: ");
        int choice = Integer.parseInt(stdin.readLine());

        if (coin == HEADS)
            if (choice == RECEIVE)
                System.out.println("You won the toss and will receive");
            else
                System.out.println("You won the toss and will kickoff");
            else
                System.out.println("You lost the coin and toss");
    }
}
