import java.util.Map;

public class PotionBrewer {

    public String brew(String potionName, Map<String, Integer> recipe) {

        if (recipe == null || recipe.isEmpty()) {
            throw new IllegalArgumentException("Invalid recipe");
        }

        System.out.println("Brewing " + potionName + "...");

        return potionName + " Potion";
    }
}