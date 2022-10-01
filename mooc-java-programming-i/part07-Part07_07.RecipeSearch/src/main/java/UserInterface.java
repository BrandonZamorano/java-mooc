
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brandonwebdev
 */
public class UserInterface {

    private Scanner scanner;
    private RecipeList recipeList;

    public UserInterface(Scanner scanner, RecipeList recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }

    public void start() {
        // Prompt for file to read
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        System.out.println("");
        printCommands();
        System.out.println("");

        // Read file
        readRecipesFromFile(fileName);

        // Loop and handle commands
        while (true) {
            // Get user input
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            // Check for exit condition
            if (command.equals("stop")) {
                break;
            }

            // handle command
            handleCommand(command);
            System.out.println("");
        }
    }

    private void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
    }

    private void handleCommand(String command) {
        if (command.equals("list")) {
            list();
        } else if (command.equals("find name")) {
            findRecipesByName();
        } else if (command.equals("find cooking time")) {
            findRecipesByMaxCookingTime();
        } else if (command.equals("find ingredient")) {
            findRecipesByIngredient();
        }
    }

    private void list() {
        System.out.println("Recipes:");
        for (Recipe recipe : recipeList.getRecipes()) {
            System.out.println(recipe);
        }
    }

    private void findRecipesByName() {
        System.out.print("Searched word: ");
        String searchQuery = scanner.nextLine();

        System.out.println("");
        System.out.println("Recipes:");
        ArrayList<Recipe> foundRecipes = recipeList.findRecipesByName(searchQuery);

        for (Recipe recipe : foundRecipes) {
            System.out.println(recipe);
        }
    }

    private void findRecipesByMaxCookingTime() {
        System.out.print("Max cooking time: ");
        int maxCookingTime = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        ArrayList<Recipe> foundRecipes = recipeList.findRecipesByMaxCookingTime(maxCookingTime);
        System.out.println("Recipes:");

        for (Recipe recipe : foundRecipes) {
            System.out.println(recipe);
        }
    }

    private void findRecipesByIngredient() {
        System.out.print("Ingredient: ");
        String ingredientSearch = scanner.nextLine();
        System.out.println("");

        ArrayList<Recipe> foundRecipes = recipeList.findRecipesByIngredient(ingredientSearch);
        System.out.println("Recipes");
        for (Recipe recipe : foundRecipes) {
            System.out.println(recipe);
        }
    }

    private void readRecipesFromFile(String fileName) {
        try ( Scanner fileReader = new Scanner(Paths.get(fileName))) {

            String recipeStringInput = "";
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                if (line.isEmpty()) {
                    recipeStringInput += "\n";
                    continue;
                }

                recipeStringInput += line + ",";
            }

            String[] recipesStringArray = recipeStringInput.split("\n");
            for (String recipeString : recipesStringArray) {
                recipeList.addRecipe(parseRecipeFromString(recipeString));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private Recipe parseRecipeFromString(String recipeString) {
//        String[] recipesStringArray = recipeStringInput.split("\n");
//        for (String recipeString : recipesStringArray) {
        String[] recipeParts = recipeString.split(",");
        String recipeName = recipeParts[0];
        int cookingTime = Integer.valueOf(recipeParts[1]);
        ArrayList<String> ingredients = new ArrayList<>();

        for (int i = 2; i < recipeParts.length; i++) {
            ingredients.add(recipeParts[i]);
        }

        return new Recipe(recipeName, cookingTime, ingredients);

    }

}
