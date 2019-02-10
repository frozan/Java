package Practise_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperature {
    final static int ThRESHOLD = 65;
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the temperature");
        int temperature = Integer.parseInt(stdin.readLine());

        System.out.println("Current temperature" + temperature);
        if (temperature<ThRESHOLD)
            System.out.println("It is cold in here");
        System.out.println("Wrapping up");
    }
}
