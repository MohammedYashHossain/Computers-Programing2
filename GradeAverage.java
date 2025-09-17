// Mohammed Hossain
// Computers and Programming 102
// 9/17/2025
// Loop homework #2

import java.util.Scanner;

public class GradeAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int grade;
        int total = 0;
        int count = 0;

        do
        {
            System.out.print("Enter a grade (0-100) or 999 to stop: ");
            grade = input.nextInt();

            if (grade == 999)
            {
                break;
            }
            else if (grade < 0 || grade > 100)
            {
                System.out.println("Invalid grade entered.");
            }
            else
            {
                total += grade;
                count++;
            }

        } while (true);

        if (count > 0)
        {
            double average = (double) total / count;
            System.out.println("Average of valid grades: " + average);
        }
        else
        {
            System.out.println("No valid grades were entered.");
        }

        input.close();
    }
}