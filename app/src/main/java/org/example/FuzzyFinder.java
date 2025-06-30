package org.example;

import java.util.ArrayList;

public class FuzzyFinder {

    public int linearSearch(ArrayList<Fuzzy> sortedFuzzies) {
        for (int i = 0; i < sortedFuzzies.size(); i++) {
            if (sortedFuzzies.get(i).color.equals("gold")) {
                return i;
            }
        }
        return -1; // Return -1 if not found
    }

    public int binarySearch(ArrayList<Fuzzy> sortedFuzzies) {
        int left = 0;
        int right = sortedFuzzies.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Fuzzy midFuzzy = sortedFuzzies.get(mid);

            if (midFuzzy.color.equals("gold")) {
                return mid; // Found the element
            } else if (midFuzzy.color.compareTo("gold") < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if not found
    }

}


/*
Add-Ons For the Portfolio

(Two Credits) Linear Search Analysis
Write me a short analysis that calculates the worst-case scenario running time for linear search on a randomized list of fuzzies. 
It should include mathematical expressions that categorize your algorithm.

Answer: 
Linear search checks each item one by one until it finds the target or reaches the end.
In the worst case it checks n items.
So, worst-case time: O(n).

(Two Credits) Binary Search Analysis
Write me a short analysis that calculates the worst-case scenario running time for binary search on a randomized list of fuzzies. 
It should include mathematical expressions that categorize your algorithm. 

Answer: 
Binary Search only works on sorted lists.
Repeatedly cuts the list in half until it finds the target.
In the worst case, it checks about log₂(n) items.
So, worst-case time: O(log n).
If the list is not sorted, binary search may give wrong results, even though it still runs in O(log n).
*/