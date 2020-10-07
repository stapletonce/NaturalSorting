package Sorting; // what am I doing with packages??

// https://www.codejava.net/java-core/collections/sorting-arrays-examples-with-comparable-and-comparator
// https://github.com/paour/natorder

import java.util.*;

public class NaturalSort implements Comparator {



    public Boolean isDigit(char character) {
        if (((int) character >= 48) && ((int) character <= 57)) {
            return true;
        }
        else {
            return false;
        }
    }


    @Override
    public int compare(Object o1, Object o2) {

        String s1 = (String) o1;
        String s2 = (String) o2;

        int pointer1 = 0;
        int pointer2 = 0;

        int startPlace1;
        int startPlace2;

        while ((s1.length() > pointer1) && (s2.length() > pointer2)) {

            String s1sub = null;
            String s2sub = null;

            // comparing strings of digits
            if (isDigit(s1.charAt(pointer1))) {
                startPlace1 = pointer1;
                while (((s1.length() > pointer1)) && (isDigit(s1.charAt(pointer1)))) {
                    pointer1++;
                }
                s1sub = s1.substring(startPlace1, pointer1);
                //System.out.println(s1sub);
            }
            if (isDigit(s2.charAt(pointer2))) {
                startPlace2 = pointer2;
                while (((s2.length() > pointer2)) && (isDigit(s2.charAt(pointer2))) && ((s2.length() > pointer2))) {
                    pointer2++;
                }
                s2sub = s2.substring(startPlace2, pointer2);
                //System.out.println(s2sub);
            }

            if ((s1sub != null) && (s2sub != null)) {
                int s1subNum = Integer.parseInt(s1sub);
                int s2subNum = Integer.parseInt(s2sub);



                if (s1subNum > s2subNum) {
                    return 1;
                }
                else if (s1subNum < s2subNum) {
                    return -1;
                }
                else {
                    return 0;
                }
            }


            // just comparing characters
            if (s1.charAt(pointer1) > (s2.charAt(pointer2))) {
                return 1;
            }
            else if ((s1.charAt(pointer1) < (s2.charAt(pointer2)))) {
                return -1;
            }
            else {
                pointer1=pointer1+1;
                pointer2=pointer2+1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        // List<String> array = new ArrayList<String>();
        //String array[] = new String[]{"1d", "1c", "1a", "1z1", "a1", "a2", "a2b2", "a2b30", "a2b3", "a90", "a100"};
        //String array[] = new String[]{"ada", "aba", "aaa", "cee", "ab"};
        String array[] = new String[]{"01", "11", "22", "123", "00046"};


        Arrays.sort(array, new NaturalSort());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
