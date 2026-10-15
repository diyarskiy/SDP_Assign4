import java.util.ArrayList;
import java.util.List;

public class PotionInventory {

    private final List<String> potions = new ArrayList<>();

    public void addPotion(String potion) {
        potions.add(potion);
        System.out.println("Added to inventory: " + potion);
    }

    public void showInventory() {
        System.out.println("Potion Inventory: " + potions);
    }
}