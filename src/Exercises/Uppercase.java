// program that changes lowercase to uppercase
package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uppercase {
    static String alphabets;
    public static void main (String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lowercase alphabets");
        alphabets = stdin.readLine();
        String mytext = upperCaseMethod(alphabets);
        System.out.println("Converted lower into upper case "+ mytext );
    }

    public static String upperCaseMethod (String character) {
        if (character != character.toUpperCase())
            character = character.toUpperCase();
        else
            return character;
        return character;
    }
}
