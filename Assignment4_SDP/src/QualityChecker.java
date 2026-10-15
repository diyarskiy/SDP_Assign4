public class QualityChecker {

    public boolean checkQuality(String potion) {

        if (potion == null || potion.isEmpty()) {
            System.out.println("Quality check failed!");
            return false;
        }

        if (!potion.endsWith(" Potion")) {
            System.out.println("Invalid potion!");
            return false;
        }

        System.out.println("Quality check passed: " + potion);
        return true;
    }
}