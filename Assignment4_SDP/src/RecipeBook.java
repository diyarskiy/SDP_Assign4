public class RecipeBook {

    public boolean hasRecipe(String potion) {
        return potion.equals("Heal") || potion.equals("Mana");
    }
}