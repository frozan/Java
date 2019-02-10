package Practise_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counter {
    final static int LIMIT = 5;
    public static void main(String[] args) throws IOException {
        int count = 1, number;

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a positive number:");
        number = Integer.parseInt(stdin.readLine());

        System.out.println("The factors of " +number+ "are: ");
        while (count<= (number/2)) {
            if (number%count==0)
                System.out.println(count);
            count = count +1;
        }

    }
}
