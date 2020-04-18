package List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Function;


public class PlayWithLinkedList {

    public static void main (String[] args) {

        LinkedList<String> country = createLinkedList();

        Function function;


    }

    public static LinkedList<String> createLinkedList () {

        LinkedList<String> list = new LinkedList<>();

        ///// Add item ti the LinkedList
        list.add("Canada");

        ///// Add first
        list.addFirst("Bangladesh");

        //// Add last
        list.addLast("India");

        ///// add specific position
        list.add(2, "USA");

        /// Add from collection
        String[] country = {"Pakistan", "Mexico", "Nepal", "China"};
        list.addAll(Arrays.asList(country));

        /// push an item
        list.push("Japan");

        System.out.println(list);

        return list;
    }


}
