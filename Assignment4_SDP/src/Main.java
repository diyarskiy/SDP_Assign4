public class Main {

    public static void main(String[] args) {

        AlchemyFacade alchemy = new AlchemyFacade();

        alchemy.brewPotion("Heal");
        alchemy.brewPotion("Mana");
        alchemy.brewPotion("Heal");
        alchemy.brewPotion("Heal");
        alchemy.brewPotion("Unknown");

        alchemy.showInventory();
    }
}