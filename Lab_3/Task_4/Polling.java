package Lab_3.Task_4;

public class Polling 
{
    private String issue;
    private int[] responses; 

    public Polling(String issue, int[] responses)
    {
        this.issue = issue;
        this.responses = responses;
    }

    public int getTotal()
    {
        int total = 0;

        for(int index = 1; index <= 10; index++)
        {
            total += index * (responses[index - 1]);
        }
        return total;
    }

    public double getAverageResult()
    {
        return (((double) getTotal()) / responses.length);
    }
}