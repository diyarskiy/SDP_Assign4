import java.util.Map;

public class RecipeBook {

    public Map<String, Integer> getRecipe(String potion) {

        if (potion.equals("Heal")) {
            return Map.of("Herb", 2, "Blood", 1);
        }

        if (potion.equals("Mana")) {
            return Map.of("Crystal", 1, "Water", 2);
        }

        throw new IllegalArgumentException("Unknown potion: " + potion);
    }
}