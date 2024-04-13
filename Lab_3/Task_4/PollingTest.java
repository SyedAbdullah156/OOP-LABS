package Lab_3.Task_4;

/*
 * (Polling) The Internet and the web are enabling more people to network, join a cause, voice
opinions, and so on. Recent presidential candidates have used the Internet intensively to get out
their messages and raise money for their campaigns. In this exercise, you’ll write a simple polling
program that allows users to rate five social-consciousness issues from 1 (least important) to 10
(most important). Pick five causes that are important to you (e.g., political issues, global environmental
issues). Use a one-dimensional array topics (of type String) to store the five causes. To summarize
the survey responses, use a 5-row, 10-column two-dimensional array responses (of type
int), each row corresponding to an element in the topics array. When the program runs, it should
ask the user to rate each issue. Have your friends and family respond to the survey. Then have the
program display a summary of the results, including:
a) A tabular report with the five topics down the left side and the 10 ratings across the top,
listing in each column the number of ratings received for each topic.
b) To the right of each row, show the average of the ratings for that issue.
c) Which issue received the highest point total? Display both the issue and the point total.
d) Which issue received the lowest point total? Display both the issue and the point total.
 */
import java.util.Scanner;
public class PollingTest 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String[] issuesTitle = {"Climate Change", "Poverty Alleviation", "Gender Equality", "Human Rights", "Education Access"};
        int[][] responses = new int[5][10];
        Polling[] poll = new Polling[5];

        int flag = 1;
        while(flag == 1)
        {
            for(int count = 0; count < 5; count++)
            {
                System.out.println("Issue: " + issuesTitle[count]);
                int rating = 0;
                do{
                    System.out.print("Please rate the issue(1-10): ");
                    rating = input.nextInt();
                }while(rating < 1 || rating > 10);
                ++responses[count][rating - 1];
            }
            do{
                System.out.print("Do you want to continue polling(1 for yes and 2 for no?: ");
                flag = input.nextInt();
            }while(flag != 1 && flag != 2);
        }

        for(int count = 0; count < 5; count++)
        {
            poll[count] = new Polling(issuesTitle[count], responses[count]); 
        }

        System.out.printf("%-20s", "Topics");
        for (int i = 0; i < 10; i++) 
        {
            System.out.printf("%5s", i + 1);
        }
        System.out.printf("%10s\n", "Average");
        
        int highest = 0, lowest = 11, highestIndex = -1, lowestIndex = -1;
        for (int issue = 0; issue < 5; issue++) 
        {
            System.out.printf("%-20s", issuesTitle[issue]);
            if(poll[issue].getTotal() > highest)
            {
                highest = poll[issue].getTotal();
                highestIndex = issue; 
            }
            if(poll[issue].getTotal() < lowest)
            {
                lowest = poll[issue].getTotal();
                lowestIndex = issue; 
            }
            for (int rates = 0; rates < 10; rates++) 
            {
                System.out.printf("%5s", responses[issue][rates]);
            }
            System.out.printf("%10.2f\n", poll[issue].getAverageResult());
        }

        System.out.println("Highest poll point issue is: " + issuesTitle[highestIndex] + " with Total: " + poll[highestIndex].getTotal());
        System.out.print("Lowest poll point issue is: " + issuesTitle[lowestIndex] + " with Total: " + poll[lowestIndex].getTotal());
    }
}
