package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> lst1 = new ArrayList<String>(Arrays.asList("Austin", "Dallas", "San Fransisco"));
        ArrayList<String> lst2 = new ArrayList<String>(Arrays.asList("Boston", "Chicago", "Denver", "Seattle"));
        System.out.println("List 1 is: ");
        System.out.println(lst1);
        System.out.println("\nList 2 is: ");
        System.out.println(lst2);
        System.out.println("\nThe merged list is: ");
        System.out.println(mergeList(lst1, lst2));

    }

    public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2) {
        ArrayList<String> merged = new ArrayList<>();
        int i = 0;
        int j = 0;
        while ((i < lst1.size()) || (j < lst2.size())){
            //One ArrayList may be bigger than the other, so when one list is finished going through
            //add the elements of the list that's remaining to parse through into the merged list by default
            if ((i < lst1.size()) && (j >= lst2.size() || lst1.get(i).compareTo(lst2.get(j)) < 0)) {
                merged.add(lst1.get(i));
                i++;
            } else {
                merged.add(lst2.get(j));
                j++;
            }
        }
        return merged;
    }
}
