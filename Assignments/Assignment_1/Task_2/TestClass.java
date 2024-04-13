package Assignments.Assignment_1.Task_2;
import java.util.ArrayList;
import java.util.Scanner;

public class TestClass 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Array of recipes for Senior Chef
        ArrayList<Recipe> recipesForSenior = new ArrayList<>(3);
        recipesForSenior.add(Recipe.BIRYANI);
        recipesForSenior.add(Recipe.BURGER);
        recipesForSenior.add(Recipe.PIZZA);

        // Array of recipes for Junior Chef
        ArrayList<Recipe> recipeForJunior = new ArrayList<>();
        recipeForJunior.add(Recipe.KORMA);

        // Array of chefs
        ArrayList<Chef> totalChefs = new ArrayList<>();
        totalChefs.add(new SeniorChef(0, recipesForSenior, 0, 20));
        totalChefs.add(new JuniorChef(1, recipeForJunior, 0, totalChefs.get(0)));

        // Printing the chefs and recipies
        for(Chef chef: totalChefs)
        {
            System.out.println("The chef " + (chef.getId() + 1) + " is a "+ chef.getClass().getSimpleName() +" with recipes:");
            for(Recipe recipe: chef.getRecipes())
            {
                System.out.println("Name: " + recipe.getName());
                System.out.println("Ingredients: " + recipe.getIngredients());
                System.out.println("Instructions: "+ recipe.getInstructions());
            }
            System.out.println();
        }

        // Taking ratings for chefs and dishes
        for(Chef chef: totalChefs)
        {
            System.out.print("Give rating of chef " + (chef.getId() + 1) +" :");
            chef.setRating(input.nextInt());
            for(Recipe recipe: chef.getRecipes())
            {
                System.out.print("Give rating for the recipe " + recipe.getName() + ": ");
                recipe.setRating(input.nextInt());
            }
            System.out.println();
        }

        // Printing the chefs and recipies and ratings
        for(Chef chef: totalChefs)
        {
            System.out.println("Rating: " + chef.getRating());
            System.out.println("The chef " + (chef.getId() + 1) + " is a "+ chef.getClass().getSimpleName() +" with recipes:");
            for(Recipe recipe: chef.getRecipes())
            {
                System.out.println("Name: " + recipe.getName());
                System.out.println("Ingredients: " + recipe.getIngredients());
                System.out.println("Instructions: " + recipe.getInstructions());
                System.out.println("Recipe's Rating: "+  recipe.getRating());
            }
            System.out.println();
        }
        input.close();
    }
}
