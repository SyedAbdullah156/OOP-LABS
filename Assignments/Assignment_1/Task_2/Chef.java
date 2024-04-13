package Assignments.Assignment_1.Task_2;
import java.util.ArrayList;

public abstract class Chef implements Rateable
{
    private final int id;
    private ArrayList<Recipe> recipes = new ArrayList<>();

    public Chef(int id, ArrayList<Recipe> recipes)
    {
        this.id = id;
        this.recipes = recipes;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object obj)
    {
        Chef chef = (Chef) obj;
        if(chef.id == id)
        {
            return true;
        }
        return false;
    }
}

