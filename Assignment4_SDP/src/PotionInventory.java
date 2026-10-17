public class PotionInventory {

    private int count = 0;

    public void addPotion(String potion) {
        count++;
        System.out.println("Added: " + potion);
    }

    public void showInventory() {
        System.out.println("Total potions: " + count);
    }
}