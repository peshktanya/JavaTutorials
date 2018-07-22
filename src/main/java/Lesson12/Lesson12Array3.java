package Lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson12Array3 {
    public static void main(String[] args)
    {
        String search[] = {"google", "yahoo", "yandex", "bing" };

        // Sorts arr[] in ascending order
        Arrays.sort(search);
        System.out.printf("Sort ascending : \n%s\n\n",
                Arrays.toString(search));

        // Sorts arr[] in descending order
        Arrays.sort(search, Collections.reverseOrder());

        System.out.printf("Sort descending : \n%s\n\n",
                Arrays.toString(search));


        byte byteArr[] = {10,20,15,22,35,24,7};
        Arrays.sort(byteArr);
        byte byteKey = 35;
        System.out.println(byteKey + " found at index = " +Arrays.binarySearch(byteArr,byteKey));

    }
}
