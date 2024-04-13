package Assignments.Assignment_1.Task_2;
import java.util.ArrayList;

public class JuniorChef extends Chef
{
    private SeniorChef supervisor;
    private int rating;

    public JuniorChef(int id, ArrayList<Recipe> recipes, int rating, Chef supervisor)
    {
        super(id, recipes);
        if(recipes.size() != 1)
        {
            throw new IllegalArgumentException("Senior Chef cannot have more than 3 recipes.");
        }
        if(rating < 0 || rating > 10)
        {
            throw new IllegalArgumentException("The rating must be >= 0 and <= 10.");
        }
        this.rating = rating;
        this.supervisor = (SeniorChef)supervisor;
    }
    
    public SeniorChef getSupervisor() {
        return supervisor;
    }
    
    public void setSupervisor(SeniorChef supervisor) {
        this.supervisor = supervisor;
    }
    
    public int getId() {
        return super.getId();
    }

    public ArrayList<Recipe> getRecipes() {
        return super.getRecipes();
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        super.setRecipes(recipes);
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }
}
