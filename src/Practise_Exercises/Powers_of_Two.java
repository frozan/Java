package Practise_Exercises;

import java.io.IOException;

public class Powers_of_Two {
    public static int LIMIT = 10;

    public static void main (String[] args) throws IOException {
        int count = 1, powers_of_two = 1;

        while (count<=LIMIT) {
            powers_of_two = powers_of_two * 2;
            System.out.println(powers_of_two + " ");
            count = count +1;
        }
        System.out.println();
        System.out.println("Done");
    }
}
