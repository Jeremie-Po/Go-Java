public class Conditions {
    public void ifelseExemple(int x) {
        if (x > 5) {
            System.out.println("x est supérieur à 5");
        } else {
            System.out.println("x est inférieur ou égal à 5");
        }

        /*
         * opératuer ternaire
         * int a = 10;
         * int b = (a > 5) ? 1 : 2;
         * System.out.println(b); // Affichera 1 car a est supérieur à 5
         * */
    }

    public void switchExemple(int x) {
        int day = x;
        switch (day) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            // Autres cas...
            default:
                System.out.println("Jour inconnu");
        }
    }

    public String betterSwitch(int x) {
        int day = x;
        return switch (day) {
            case 1 -> "Lundi";
            case 2 -> "Mardi";
            // Autres cas...
            default -> "Jour inconnu";
        };
    }

    public void equalsExemple(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("Les chaînes de caractères sont égales");
        } else {
            System.out.println("les chaines de caractères ne sont pas égales");
        }
    }

    public static void main(String[] args) {
        Conditions conditions = new Conditions();
        conditions.ifelseExemple(10);
        conditions.switchExemple(2);
        System.out.println(conditions.betterSwitch(1));
        conditions.equalsExemple("Hello", "Hello");
        conditions.equalsExemple("Hello", "World");
    }
}
