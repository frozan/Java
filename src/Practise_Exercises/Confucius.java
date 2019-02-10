package Practise_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Confucius {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String quest, name, color;
        System.out.println("What is your name");
//        System.out.flush();
        name = stdin.readLine();

        System.out.println("What is your quest");
//        System.out.flush();
        quest = stdin.readLine();

        System.out.println("What is your favorite color");
//        System.out.flush();
        color = stdin.readLine();

        System.out.println("Name: " + name);
        System.out.println("Quest: " + quest);
        System.out.println("Color: " + color);
    }
}
