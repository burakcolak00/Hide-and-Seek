package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class FuzzyFinderTest {
    @Test
    void testLinearSearchOnSortedFuzzies() {
        FuzzyListGenerator generator = new FuzzyListGenerator(1);
        FuzzyFinder finder = new FuzzyFinder();
        
        int result = finder.linearSearch(generator.sortedRainbowFuzzies());
        assertEquals(1, result); // "gold" is the second element in sorted list after "blue"
    }

    @Test
    void testBinarySearchOnSortedFuzzies() {
        FuzzyListGenerator generator = new FuzzyListGenerator(1);
        FuzzyFinder finder = new FuzzyFinder();
        
        int result = finder.binarySearch(generator.sortedRainbowFuzzies());
        assertEquals(1, result); // "gold" is the second element in sorted list after "blue"
    }
    
    @Test
    void testLinearSearchOnRandomizedFuzzies() {
        FuzzyListGenerator generator = new FuzzyListGenerator(1);
        FuzzyFinder finder = new FuzzyFinder();

        // Get the randomized list
        ArrayList<Fuzzy> randomizedFuzzies = generator.randomizedRainbowFuzzies();

        // Find the index of "gold" using linear search
        int result = finder.linearSearch(randomizedFuzzies);

        // Find the expected index by searching for "gold" in the randomized list
        int expectedIndex = -1;
        for (int i = 0; i < randomizedFuzzies.size(); i++) {
            if (randomizedFuzzies.get(i).color.equals("gold")) {
                expectedIndex = i;
                break;
            }
        }

        assertEquals(expectedIndex, result);
    }
}
