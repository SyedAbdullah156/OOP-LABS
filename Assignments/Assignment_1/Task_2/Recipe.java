package Assignments.Assignment_1.Task_2;

public enum Recipe implements Rateable
{
    BIRYANI("Biryani", "Rice, Chicken", "Instructions for Biryani", 0),
    BURGER("Burger", "Burger Bread, Chicken", "Instructions for Burger", 0),
    PIZZA("Pizza", "Pizza Bread, Cheese", "Instructions for Pizza", 0),
    KORMA("Korma", "Korma Masala, Chicken", "Instructions for Korma", 0);

    private String name;
    private String ingredients;
    private String instructions;
    private int rating;

    Recipe(String name, String ingredients, String instructions, int rating)
    {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        if(rating < 0 || rating > 10)
        {
            throw new IllegalArgumentException("The rating must be >= 0 and <= 10.");
        }
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public boolean equals(Recipe recipe)
    {
        if(recipe == this)
        {
            return true;
        }
        return false;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int getRating() {
        return rating;
    }
}