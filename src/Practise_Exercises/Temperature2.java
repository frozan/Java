package Practise_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperature2 {
    final static int FREEZING_POINT = 32;
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the temperature");
        int temperature = Integer.parseInt(stdin.readLine());

        System.out.println("Current temperature" + temperature);
        if (temperature< FREEZING_POINT)
            System.out.println("It is cold in here");
        else
            System.out.println("Above freezing");
        System.out.println("Wrapping up");
    }
}
