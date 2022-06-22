package com.nickweb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*
// Using HashMap
public class RemoveDuplicatesFromArray {
    static void removeDuplicates(int[] arr, int n) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            // Print the element if it is not present there in the hashmap and Insert the element in the hashmap
            if(map.get(arr[i]) == null) { // map.get() is used to retrieve or fetch or find the value by its key
                System.out.print(arr[i] + " ");
                map.put(arr[i], true); // map.put() is used to insert the key & value pair in the hashmap
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4};
        int n = arr.length;

        removeDuplicates(arr, n);
    }
}

// TC: O(n)
// SC: O(m)
*/

// Use HashSet if you don't want to maintain the insertion order OR Use LinkedHashSet if you want to maintain the insertion order
// Using LinkedHashSet
public class RemoveDuplicatesFromArray {
    static void removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Adding elements to LinkedHashSet
        for (int i = 0; i < arr.length; i++){
            set.add(arr[i]); // set.add() method is used to add elements into HashSet
        }

        // Print the elements of LinkedHashSet
        System.out.print(set);
    }

    public static void main(String[] args) {
        int[] arr = {1,9,4,2,2,3,4,4};

        // Function call
        removeDuplicates(arr);
    }
}


/*
    Q. WAP to remove duplicates from array.

    INPUT: [1,2,2,3,4,4] OUTPUT: [1,2,3,4]
 */