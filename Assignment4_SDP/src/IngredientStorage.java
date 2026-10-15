import java.util.HashMap;
import java.util.Map;

public class IngredientStorage {

    private Map<String, Integer> ingredients = new HashMap<>();

    public IngredientStorage() {
        ingredients.put("Herb", 5);
        ingredients.put("Water", 5);
        ingredients.put("Crystal", 3);
        ingredients.put("Blood", 2);
    }

    public boolean hasIngredients(Map<String, Integer> recipe) {
        for (String item : recipe.keySet()) {
            if (ingredients.getOrDefault(item, 0) < recipe.get(item)) {
                return false;
            }
        }
        return true;
    }

    public void useIngredients(Map<String, Integer> recipe) {
        if (!hasIngredients(recipe)) {
            throw new IllegalStateException("Not enough ingredients");
        }

        for (String item : recipe.keySet()) {
            int remaining = ingredients.get(item) - recipe.get(item);
            ingredients.put(item, remaining);
        }
    }
}