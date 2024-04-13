package Lab_1;

/*
 * (Tabular Output) Write a Java application that uses looping to print the following table of values:
 */
public class Task_4 
{
    public static void main(String[] args)
    {
        System.out.printf("%s %5s %10s %17s\n", "N", "10*N", "100*N", "1000*N");
        System.out.println();
        for(int i = 1; i <= 5; i++)
        {
            System.out.printf("%d %3d %10d %17d\n", i, i * 10, i * 100, i * 1000);
        }
    }
}
