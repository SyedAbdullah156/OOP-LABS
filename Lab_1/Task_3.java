package Lab_1;

/*
In physics, a common useful equation for finding the position s of a body in linear motion at a given time t, based 
on its initial position s0, initial velocity v0, and rate of acceleration a, is the following:
s=s_0+v_0 t+1/2 at^2
Write code to declare variables for s_0, v_0, a, and t, and then write the code to compute s on the basis of these 
values.
*/
import java.util.Scanner;
public class Task_3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time: ");
        int t = input.nextInt();

        System.out.print("Enter the initial position: ");
        double s0 = input.nextDouble();

        System.out.print("Enter the initial velocity: ");
        double v0 = input.nextDouble();

        System.out.print("Enter the acceleration: ");
        double a = input.nextDouble();

        double s = s0 + (v0 * t) + (0.5 * a * t * t);

        System.out.printf("The final position will be: %.2f", s);

        input.close();
    } 
}
