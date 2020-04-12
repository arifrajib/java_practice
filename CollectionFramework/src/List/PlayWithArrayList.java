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
        sortTiem(country);

        System.out.println("Country ArrayList: " + country);
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

    private static void sortTiem (List<String> list) {

        System.out.println("Before sort: " + list);
        list.sort(Comparator.naturalOrder());
        System.out.println("Before dort: " + list + "\n");
    }


}
