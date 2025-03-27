import java.util.*;

public class Collection {

    /*
     * Array list est utilisé pour stocker de manière dynamique et acceder rapidement à des données
     * */
    public void ArrayListExemple() {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Hello");
        liste.add("World");
        liste.add("!");
        for (String s : liste) {
            System.out.println(s);
        }
    }

    /*
        Linked List est utiliser pour manipuler : insérer ou supprimer de façon efficace
     */
    public void LinkedListExemple() {
        // Création d'une LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Ajout de quelques noms
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Eve");

        // Insertion du nom "Charlie" entre "Bob" et "Eve"
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Bob")) {
                iterator.add("Charlie");
                break;
            }
        }

        // Affichage des noms après l'insertion
        for (String name : linkedList) {
            System.out.println(name);
        }
    }

    /*
    stock des éléments ubniques sans doublons permet une manipulation rapide d'ajout, suppression et recherche
     */
    public void HashSetExemple() {
        HashSet<String> hashSet = new HashSet<>();

        // Ajout d'éléments
        hashSet.add("Pomme");
        hashSet.add("Banane");
        hashSet.add("Orange");

        // Tentative d'ajout d'un élément déjà existant
        boolean result = hashSet.add("Pomme");
        System.out.println("Résultat de l'ajout : " + result); // Affiche "false"

        // Affichage des éléments du HashSet
        System.out.println(hashSet);
    }

    /*
    class pour personnaliser la comparaison dans le treeset
    pas de comparaison alphabetique mais comparaison par nbre de lettres
     */
    class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            int lengthComparison = Integer.compare(s1.length(), s2.length());
            if (lengthComparison == 0) {
                return s1.compareTo(s2); // Comparaison lexicographique si les longueurs sont égales
            }
            return lengthComparison;
        }
    }

    /*
    pareil que HasSet mais la collection est triée
     */
    public void treeSetExemple() {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Ajout d'éléments
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);

        // Affichage des éléments du TreeSet
        System.out.println(treeSet); // Affiche les éléments triés : [1, 2, 5, 8]


        //element string du treeset
        TreeSet<String> treeSet2 = new TreeSet<>(Collections.reverseOrder());

        treeSet2.add("abracadabra");
        treeSet2.add("expensive patronum");
        treeSet2.add("bliblablubloblou");

        System.out.println(treeSet2);

        //personalisation de la comparaison (grace à la class StringlengthComparator)
        TreeSet<String> treeSet3 = new TreeSet<>(new StringLengthComparator());

        // Ajout d'éléments
        treeSet3.add("Pomme");
        treeSet3.add("Bananes");
        treeSet3.add("Orange");
        treeSet3.add("louise");
        treeSet3.add("pot");

        // Affichage des éléments du TreeSet
        System.out.println(treeSet3); // Affiche les chaînes triées par longueur : [Pomme, Banane, Orange, Fraise]
    }

    public void HashMapExemple() {
        HashMap<String, Integer> map = new HashMap<>();

        // Ajout de paires clé-valeur à la HashMap
        map.put("Martine", 25);
        map.put("Jean", 30);
        map.put("Alain", 28);
        map.put("Balain", 28);

        // Accès à une valeur à l'aide de sa clé
        int ageOfJean = map.get("Jean");
        System.out.println("Age de Jean : " + ageOfJean);

        System.out.println("La HashMap contient martine : " + map.containsKey("Martine"));

        // Suppression d'une paire clé-valeur
        map.remove("Martine");

        System.out.println("La HashMap contient martine : " + map.containsKey("Martine"));
        // Parcours des paires clé-valeur de la HashMap

        for (String name : map.keySet()) {
            int age = map.get(name);
            System.out.println(name + " a " + age + " ans.");
        }
    }

    public void TreeMapExemple() {
        // Création d'une instance de TreeMap avec des clés de type String et des
        // valeurs de type Integer
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Ajout de paires clé-valeur à la TreeMap
        treeMap.put("Bob", 30);
        treeMap.put("Alice", 25);
        treeMap.put("David", 35);
        treeMap.put("Charlie", 28);

        // Affichage de la TreeMap initiale
        System.out.println("TreeMap initiale : " + treeMap);

        // Accès à une valeur à l'aide de sa clé
        int ageOfBob = treeMap.get("Bob");
        System.out.println("Age de Bob : " + ageOfBob);

        // Suppression d'une paire clé-valeur
        treeMap.remove("Charlie");

        // Affichage de la TreeMap après la suppression
        System.out.println("TreeMap après suppression : " + treeMap);

        // Parcours des paires clé-valeur de la TreeMap
        for (String name : treeMap.keySet()) {
            int age = treeMap.get(name);
            System.out.println(name + " a " + age + " ans.");
        }

    }


    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.ArrayListExemple();

        collection.LinkedListExemple();

        collection.HashSetExemple();

        collection.treeSetExemple();

        collection.HashMapExemple();

        collection.TreeMapExemple();
    }
}
