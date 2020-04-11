package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {

    public static void main (String[] args) {

        listCollection();


    }

    private static void listCollection () {

        Collection<String> food = new ArrayList<>();

        // Add new item to the food list
        food.add("Rice");
        food.add("Fish");
        food.add("Pasta");
        food.add("Beef");

        for (String foodItem : food){
            System.out.println(foodItem);
        }
    }

}
