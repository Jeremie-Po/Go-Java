import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tableau {

    public void ArrayExemple() {
        //creation d'un tbaleau de 10 emplacement vide
        int[] tableau = new int[10];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i * 2;
        }
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }

        //creation d'un tableau de 5 emplacement rempli
        int[] tableau2 = {1, 2, 3, 4, 5};

        //creation d' un tableau imbriqué
        int[][] tableau3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // ou

        int[] tab1 = {1, 2, 3};
        int[] tab2 = {4, 5, 6};
        int[][] tableau4 = {tab1, tab2};

        System.out.println(Arrays.toString(tableau4[1])); // affiche [4, 5, 6]

    }

    public void ArrayListExemple() {
        ArrayList<Integer> listeEntiers = new ArrayList<>();

        // Ajout d'éléments à l'ArrayList
        listeEntiers.add(10);
        listeEntiers.add(20);
        listeEntiers.add(30);

        //ou

        /*
                ArrayList<Integer> listeEntiers = new ArrayList<>(Arrays.asList(10, 20, 30));

         */

        //ou

        /*
          ArrayList<Integer> listeEntiers = new ArrayList<>() {
            {
                add(10);
                add(20);
                add(30);
            }
        };
         */

        // Parcours et affichage des éléments de l'ArrayList
        for (int i = 0; i < listeEntiers.size(); i++) {
            System.out.println(listeEntiers.get(i));
        }

        // ou creation a partir d'un stream de string

        ArrayList<String> list = Stream.of("Hello", "Coucou", "Haha")
                .collect(Collectors.toCollection(
                        ArrayList::new));

        System.out.println(list); // affiche [Hello, Coucou, Haha]

        /*
        - **add(element) :**  que l’on vient d’utiliser, qui permet d'ajouter un élément à la fin de la liste.
        - **remove(index)** : qui permet de supprimer l'élément à l'index spécifié de la liste.
        - **get(index)** : qui permet de récupérer l'élément à l'index spécifié de la liste.
        - **size()** : qui renvoie la taille de la liste, c'est-à-dire le nombre d'éléments qu'elle contient.
        - **clear()** : qui permet de vider la liste, en supprimant tous les éléments.
        - **contains(element)** : qui vérifie si la liste contient l'élément spécifié et renvoie true s'il est présent, sinon renvoie false.
        - **isEmpty()** : qui vérifie si la liste est vide et renvoie true si elle est vide, sinon renvoie false.
        - **indexOf(element)** : qui renvoie l'index de la première occurrence de l'élément spécifié dans la liste, ou -1 si l'élément n'est pas présent.
        - **set(index, element)** : qui remplace l'élément à l'index spécifié par l'élément spécifié.
         */
    }

    public void ArraySort() {
        Integer[] tab = {5, 2, 8, 1, 9};

        // tri Decroissant
        Arrays.sort(tab, Collections.reverseOrder());
        System.out.println(Arrays.toString(tab));


//        for (int i = 0; i < tab.length; i++) {
//            System.out.print(tab[i] + " ");
//        }

        //tri Croissant
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

        // Affichage du tab trié
//        for (int i = 0; i < tab.length; i++) {
//            System.out.print(tab[i] + " ");
//        }

    }

    public static void main(String[] args) {
        Tableau tab = new Tableau();

        tab.ArrayExemple();

        tab.ArrayListExemple();

        tab.ArraySort();
    }

}
