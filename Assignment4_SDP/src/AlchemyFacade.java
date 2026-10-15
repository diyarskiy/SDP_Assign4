import java.util.Map;

public class AlchemyFacade {

    private final RecipeBook recipeBook = new RecipeBook();
    private final IngredientStorage ingredientStorage = new IngredientStorage();
    private final PotionBrewer potionBrewer = new PotionBrewer();
    private final QualityChecker qualityChecker = new QualityChecker();
    private final PotionInventory potionInventory = new PotionInventory();

    public void brewPotion(String potionName) {
        try {
            Map<String, Integer> recipe = recipeBook.getRecipe(potionName);

            if (!ingredientStorage.hasIngredients(recipe)) {
                System.out.println("Not enough ingredients!");
                return;
            }

            String potion = potionBrewer.brew(potionName, recipe);

            if (!qualityChecker.checkQuality(potion)) {
                System.out.println("Potion quality check failed!");
                return;
            }

            ingredientStorage.useIngredients(recipe);
            potionInventory.addPotion(potion);

            System.out.println("Successfully brewed: " + potion);

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Brewing failed: " + e.getMessage());
        }
    }

    public void showInventory() {
        potionInventory.showInventory();
    }
}