public class Bow implements Weapon{

    @Override
    public int getDamage() {
        return 70;
    }

    @Override
    public String getDescription() {
        return "Bow";
    }
}
