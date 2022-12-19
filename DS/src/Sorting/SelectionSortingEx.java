package Sorting;

import java.util.Arrays;

public class SelectionSortingEx {

    public static void main(String[] args) {

        Integer [] a = {3, 4, 7, 2, 5};
        int k = 5;

        SelectionSorting.selectionSort(a, k);

        System.out.println(Arrays.toString(a));

    }

}
