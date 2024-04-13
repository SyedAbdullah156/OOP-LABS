package Assignments.Assignment_1.Task_2;
import java.util.ArrayList;

public class SeniorChef extends Chef
{
    private int yearsOfExperience;
    private int rating;

    public SeniorChef(int id, ArrayList<Recipe> recipes, int rating, int yearsOfExperience)
    {
        super(id, recipes);
        if(recipes.size() > 3)
        {
            throw new IllegalArgumentException("Senior Chef cannot have more than 3 recipes.");
        }
        if (yearsOfExperience < 0) 
        {
            throw new IllegalArgumentException("Years of experience cannot be negative.");
        }
        if(rating < 0 || rating > 10)
        {
            throw new IllegalArgumentException("The rating must be >= 0 and <= 10.");
        }
        this.rating = rating;
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
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
