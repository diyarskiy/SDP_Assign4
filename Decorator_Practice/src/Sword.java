public class Sword implements Weapon {

    @Override
    public String getDescription() {
        return "Sword";
    }

    @Override
    public int getDamage() {
        return 100;
    }
}