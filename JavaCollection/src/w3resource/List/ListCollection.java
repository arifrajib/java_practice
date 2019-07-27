package w3resource.List;

import java.util.*;
import java.util.stream.Collectors;

public class ListCollection {
    public void testList(){
        /**
         * Creating New List
         */
        List<String> list = new ArrayList<String>();

        ArrayList<String> list2 = new ArrayList<>();

        var list3 = new ArrayList<String>();

        /**
         * Add item
         */
        list.add("One");
        list.add("Two");
        list.add("Three");
        //list.forEach(System.out::println);
        //System.out.println(list);

        list2.addAll(list);
        list2.addAll(3, list);

        //list2.forEach(e -> System.out.println(e));

        /**
         * Retrive Element
         */
        //System.out.println("Value on index 3 "+list2.get(3));


        /**
         * LinkList
         */
        LinkedList<String> linkList = new LinkedList<>();
        linkList.addAll(list2);


        /**
         * Retrive Element
         */
        //System.out.println("Value on index 3 "+linkList.get(3));
        //System.out.println("Size "+linkList.size());

        //linkList.forEach(e -> System.out.println(e));


        /**
         * Searching
         */
        //System.out.println("Does it contains: "+linkList.contains("Two"));
        //System.out.println("Search from first: "+linkList.indexOf("Two"));
        //System.out.println("Search from lats: "+linkList.lastIndexOf("Two"));


        /**
         * Sorting
         */
        //System.out.println("Before Sort "+list2);
        list2.sort((e, f) -> - e.compareTo(f));
        //System.out.println("After Sort "+list2);

        /**
         * Shuffle
         */
        Collections.shuffle(list2);
        //System.out.println(list2);

        /**
         * Reverse
         */
        Collections.reverse(list2);
        //System.out.println(list2);

        /**
         * Converting between Array and List
         */
        list.clear();
        System.out.println(list);
        list.addAll(Arrays.asList("Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen"));
        System.out.println(list);
        Object[] arraylist = list.toArray(new String[0]);
        System.out.println(arraylist);


        /**
         * Copy
         */
        //First Destination need to be fit for source
        //list3.addAll(Arrays.asList("Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen"));

        //Collections.copy(list3, list2);
        //System.out.println(list3);
    }
}
