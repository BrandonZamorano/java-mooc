
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brandonwebdev
 */
public class RecipeList {

    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public ArrayList<Recipe> findRecipesByName(String search) {
        ArrayList<Recipe> matchedRecipes = new ArrayList<>();

        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(search)) {
                matchedRecipes.add(recipe);
            }
        }

        return matchedRecipes;
    }

    public ArrayList<Recipe> findRecipesByMaxCookingTime(int maxCookingTime) {
        ArrayList<Recipe> matchedRecipes = new ArrayList<>();

        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                matchedRecipes.add(recipe);
            }
        }

        return matchedRecipes;
    }

}
