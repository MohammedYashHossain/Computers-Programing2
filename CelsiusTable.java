// Mohammed Hossain
// Computers and Programming 102
// 9/22/2025
// Method homework option 6

public class CelsiusTable
{
    public static double celsius(int fahrenheit)
    {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    public static void main(String[] args)
    {
        System.out.println("Fahrenheit\tCelsius");

        for (int f = 0; f <= 20; f++)
        {
            System.out.println(f + "\t\t" + celsius(f));
        }
    }
}
