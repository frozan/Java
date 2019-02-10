package Practise_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average2 {
    public static void main(String[] args) throws IOException {
        int grade = 9999, count = 0, max = 0;
        float sum = 0, avergage;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        while (grade >= 0) {
            System.out.println("Enter a grade or -1 to quit");
            System.out.flush();
            grade = Integer.parseInt(stdin.readLine());
            if (grade >= 0) {
                count = count + 1;
                sum = sum + grade;
                if (grade > max)
                    max = grade;
            }
        }
        if (count == 0)
            System.out.println("No valid grades were entered");
        else {
            avergage = sum / count;
            System.out.println();
            System.out.println("The number of students " + count);
            System.out.println("Practise_Exercises.Average grade " + avergage);
            System.out.println("Highest grade " + max);
        }
    }
}
