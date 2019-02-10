package Practise_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    public static void main(String[] args) throws IOException {
        int grade, count = 0, max, sum = 0, avergage;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a grade or -1 to quit");
        grade = Integer.parseInt(stdin.readLine());
        max = grade;
        while (grade >= 0) {
            count = count + 1;
            sum = sum + grade;
            if (grade > max)
                max = grade;
            System.out.println("Enter the next grade: ");
            grade = Integer.parseInt(stdin.readLine());
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
