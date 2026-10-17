public class IngredientStorage {

    private int herbs = 4;
    private int crystals = 2;
    private int water = 4;
    private int blood = 2;

    public boolean hasIngredients(String potion) {
        if (potion.equals("Healing")) {
            return herbs >= 2 && water >= 1 && blood >= 1;
        }

        if (potion.equals("Mana")) {
            return crystals >= 1 && water >= 2;
        }

        return false;
    }

    public void useIngredients(String potion) {
        if (potion.equals("Healing")) {
            herbs -= 2;
            water -= 1;
            blood -= 1;
        }

        if (potion.equals("Mana")) {
            crystals -= 1;
            water -= 2;
        }
    }
}