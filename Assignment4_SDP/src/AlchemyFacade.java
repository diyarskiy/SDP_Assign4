public class AlchemyFacade {

    private RecipeBook recipes = new RecipeBook();
    private IngredientStorage storage = new IngredientStorage();
    private PotionBrewer brewer = new PotionBrewer();
    private PotionInventory inventory = new PotionInventory();

    public void brewPotion(String name) {

        if (!recipes.hasRecipe(name)) {
            System.out.println("Unknown recipe!");
            return;
        }

        if (!storage.hasIngredients(name)) {
            System.out.println("Not enough ingredients!");
            return;
        }

        storage.useIngredients(name);

        String potion = brewer.brew(name);
        inventory.addPotion(potion);
    }

    public void showInventory() {
        inventory.showInventory();
    }
}