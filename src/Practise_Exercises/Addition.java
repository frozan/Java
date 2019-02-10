package Practise_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition {
    public static void main (String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String str1, str2, str3;
        int n1, n2, sum;

        System.out.println("Enter a number");
        str1 = stdin.readLine();
        n1 = Integer.parseInt(str1);

        System.out.println("Enter a number");
        str2 = stdin.readLine();
        n2 = Integer.parseInt(str2);

        sum = n1 + n2;
        System.out.println("The sum is" + sum);
    }
}
