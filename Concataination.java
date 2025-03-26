public class Concataination {
    public void ConcatainationSimple(String nom, int age) {
        String message = "Bonjour, je m'appelle " + nom + " et j'ai " + age + " ans.";
        System.out.println(message);
    }

    public void ConcatainationSimple() {
        ConcatainationSimple("Jean", 25);
    }

    public void ConcatainationConcat() {
        String nom = "Jean";
        String message = "Bonjour, je m'appelle ".concat(nom);
        System.out.println(message);
    }

    public void ConcatainationStringFormat() {
        String nom = "Jean";
        int age = 25;
        String message = String.format("Bonjour, je m'appelle %s et j'ai %d ans.", nom, age);
        System.out.println(message);

        /*
         *https://delbaze.notion.site/Java-Spring-Hibernate-Gradle-9394a3f261354e50b18591a7de1a7079#5fde6ce7125148a4b8a04c8cb75dcb26
         */
    }

    public static void main(String[] args) {
        Concataination concataination = new Concataination();
        concataination.ConcatainationSimple();
        concataination.ConcatainationSimple("Jane", 20);
        concataination.ConcatainationConcat();
    }

}
