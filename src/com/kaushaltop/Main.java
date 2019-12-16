package com.kaushaltop;

import java.util.ArrayList;

public class Main {

    private static ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] args) {

        //Add item, print item
        addGroceryItems("Tomatoes");
        addGroceryItems("Mangoes");
        addGroceryItems("Eggs");
        printGroceryList();


        //Print specific item
        System.out.println();
        String getSpecificItem = printSpecificItem(1);
        System.out.println("Specific Item: "+getSpecificItem);


        //Modify the list
        System.out.println();
        modifyGroceryList(0, "Carrot");
        System.out.println("List modified---");
        printGroceryList();


        //Remove item from list
        System.out.println();
        System.out.println("List modified---");
        removeGroceryItem(2);
        printGroceryList();


        //Search item
        System.out.println();
        searchItem("Mangoes");

    }

    public static void addGroceryItems(String item) {

        groceryList.add(item);
    }

    public static String printSpecificItem(int index) {

        return groceryList.get(index);
    }

    public static void printGroceryList() {

        System.out.println("Total items in list: "+groceryList.size());

        for (int i=0; i<groceryList.size(); i++) {

            System.out.println((i+1)+") "+groceryList.get(i));

        }
    }

    public static void modifyGroceryList(int position, String newItem) {

        groceryList.set(position, newItem);

    }

    public static void removeGroceryItem(int position) {

        groceryList.remove(position);
        System.out.println("Item "+(position+1)+" removed!");

    }

    public static String searchItem(String name) {

        if (groceryList.contains(name)) {

            System.out.println("Searching "+name+"...");
            System.out.println("Item "+"'"+name+"'"+" present!");

            return name;

        } else {

            System.out.println("Item not present");
            return null;

        }
    }

}
