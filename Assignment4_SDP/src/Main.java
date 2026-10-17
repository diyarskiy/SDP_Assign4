public class Main {

    public static void main(String[] args) {

        AlchemyFacade alchemy = new AlchemyFacade();

        alchemy.brewPotion("Healing");
        alchemy.brewPotion("Mana");
        alchemy.brewPotion("Healing");
        alchemy.brewPotion("Mana");
        alchemy.brewPotion("Healing");
        alchemy.brewPotion("Unknown");

        alchemy.showInventory();
    }
}