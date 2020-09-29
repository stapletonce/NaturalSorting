package Sorting; // what am I doing with packages??

// https://www.codejava.net/java-core/collections/sorting-arrays-examples-with-comparable-and-comparator
// https://github.com/paour/natorder

import java.util.*;

public class NaturalSort implements Comparator {

//    public List<String> sortIncreasing(List<String> array) {
//
//    }

    @Override
    public int compare(Object o1, Object o2) {

        System.out.println("hey");

        if ((o1.equals("1d")) && (o2.equals("1c"))) {
            return 1;
        }


        return 0;
    }

    public static void main(String[] args) {

        // List<String> array = new ArrayList<String>();
        String array[] = new String[]{"1d", "1c", "1a", "1z1", "a1", "a2", "a2b2", "a2b30", "a2b3", "a90", "a100"};

        Arrays.sort(array, new NaturalSort());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
