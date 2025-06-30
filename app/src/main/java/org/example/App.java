package org.example;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();

    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

    int testOne = finder.linearSearch(sortedFuzzies);
    int testTwo = finder.binarySearch(sortedFuzzies);
    int testThree = finder.linearSearch(randomFuzzies);
    int testFour = finder.binarySearch(randomFuzzies);

    System.out.println("Linear Search on Sorted Fuzzies: " + testOne);
    System.out.println("Binary Search on Sorted Fuzzies: " + testTwo);
    System.out.println("Linear Search on Randomized Fuzzies: " + testThree);
    System.out.println("Binary Search on Randomized Fuzzies: " + testFour);
  }
}
