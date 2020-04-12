package List;

import java.util.*;

public class PlayWithArrayList {

    public static void main (String[] args) {


        //// Create ArrayList
        List<String> country = createArrayList();


        //// Add elements
        addElements(country);


        //// Get Elements
        getItem(country);

        //// Search Elements
        searchItem(country);


        //// Sort Item
        sortItem(country);

        //// iterate list
        iterateItem(country);

        System.out.println("Country ArrayList: " + country);


        //// Remove item from list
        removeItem ();

    }

    private static List<String> createArrayList () {
        /*
        ///// Create ArrayList
         */
        List<String> country = new ArrayList<>();

        return country;
    }

    private static void addElements (List<String> list) {
        //// Add item to the list
        list.add("Canada");

        //// Add Array to the List
        String[] countryArray = {"Bangladesh", "USA"};
        list.addAll(Arrays.asList(countryArray));

        //// Add item to specific index
        list.add(2, "India");
    }

    private static void getItem (List<String> list) {
        //// Get item from specific position
        System.out.println("Item on position 1: " + list.get(1) + "\n\n");

    }

    private static void searchItem (List<String> list) {

        Objects.requireNonNull(list);

        //// Contains
        boolean have = list.contains("Bangladesh");
        System.out.println("The list contains Bangladesh? " + (have ? "Yes" : "No") + "\n");


        //// search from left
        int indexFromLeft = list.indexOf("Bangladesh");
        System.out.println("Index of Bangladesh: " + indexFromLeft + "\n");


        //// search from right
        int indexfromRight = list.lastIndexOf("India");
        System.out.println("Index of India: " + indexfromRight + "\n");


        //// Search if not found
        int notFound = list.indexOf("China");
        System.out.println("Index of China: " + notFound + "\n");

    }

    private static void sortItem (List<String> list) {

        System.out.println("Before sort: " + list);
        list.sort(Comparator.naturalOrder());
        System.out.println("Before dort: " + list + "\n");
    }

    private static void iterateItem (List<String> list) {

        Iterator<String> iterator = list.iterator();
        System.out.print("Iterate List [ ");
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.print(str + " ");
        }
        System.out.print("]" + "\n");
    }

    private static void removeItem () {

        //// Integer ArrayList
        List<Integer> list = new ArrayList<>();

        //// Add item to the list
        for (int i=0; i<10; i++) {
            list.add(i);
        }

        //// Initial list
        System.out.println ("\n\n");
        System.out.println ("Initial List " + list);

        /// remove 6 from the lsit
        list.remove(Integer.valueOf(6));
        System.out.println ("After removing 6 " + list);

        /// remove item for index 3
        list.remove(3);
        System.out.println ("After removing index 3 " + list);

        list.clear();
        System.out.println ("After clear the list " + list);

    }

}
