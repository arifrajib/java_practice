package Collection;

import java.util.*;

public class CollectionImplementation {

    public static void main (String[] args) {

        System.out.println("ArrayList Implementation ");
        /// ArrayList
        listImplementation();

        System.out.println("\n\n\nHashSet Implementation ");
        /// HashSet
        setImplementation();

    }

    private static void listImplementation () {
        //// ArrayList
        List<String> list = new ArrayList<>();

        //// Add item to the list
        list.add("Item One");
        list.add("Item Two");
        list.add("Item Three");
        list.add("Item Four");
        list.add("Item Five");
        // duplicate
        list.add("Item Five");

        //// manipulate the list
        for (String item : list) {
            System.out.println(item);
        }
    }

    private static void setImplementation () {
        //// HashSet
        Set<String> days = new HashSet<>();

        //// Add Item to the Set
        days.add("Saturday");
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");

        //duplicate item overwrite
        days.add("Friday");

        for (String item : days) {
            System.out.println(item);
        }
    }

}
