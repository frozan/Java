package Exercises;

import java.util.Random;

public class RandomExp {

    public static void main(String[] args) {
        Random num = new Random();
        float value = Math.abs(num.nextFloat()) ;
        System.out.println("Random number b/w 0 and 1 is: " + value);
        int value1 = Math.abs(num.nextInt(100) + 1) ;
        System.out.println("Random number b/w 1 and 100 is: " + value1);
        int value2 = num.nextInt(55) -5 ;
        System.out.println("Random number b/w -5 and 55 is: " + value2);
        int value3 = num.nextInt(10000) -10000;
        System.out.println("Random number b/w -10000 and 10000 is: " + value3);
        System.out.println("Random number b/w 3 and 4 is: " +getRandominRange(3,4));

    }

    private static float getRandominRange(int min, int max) {
        return (float)(Math.random() *((max-min) )) + min;
    }
}
