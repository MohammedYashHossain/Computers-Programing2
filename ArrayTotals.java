// Mohammed Hossain
// Computers and Programming 102
// 9/22/2025
// Array homework option 2

import java.util.Scanner;

public class ArrayTotals
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[] price = new double[10];
        int[] amount = new int[10];
        double[] total = new double[10];

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter price " + (i + 1) + ": ");
            price[i] = input.nextDouble();

            System.out.print("Enter amount " + (i + 1) + ": ");
            amount[i] = input.nextInt();

            total[i] = price[i] * amount[i];
        }

        System.out.println("\ntotal\tprice\tamount");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(total[i] + "\t" + price[i] + "\t" + amount[i]);
        }

        input.close();
    }
}
