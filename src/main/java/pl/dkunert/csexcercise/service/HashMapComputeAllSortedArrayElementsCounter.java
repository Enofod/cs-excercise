package pl.dkunert.csexcercise.service;

import java.util.HashMap;
import java.util.Map;

// Multiple map call per element - no need to be sorted. Operations on hashmap are usually O(1), but if the Comparable element will have "bad" hashcode it can go up to O(N).
// So this can have complexity from O(n) to O(2n), depending on the comparable object and number of unique objects in array
public class HashMapComputeAllSortedArrayElementsCounter extends SortedArrayElementsCounter {

    @Override
    protected Map<Object, Integer> countNumberOfElementsOccurrences(Comparable[] elements) {

        HashMap<Object, Integer> elementsCounterMap = new HashMap<>();

        for (Object element : elements) {
            elementsCounterMap.compute(element, (k, v) -> (v == null) ? 1 : v + 1);
        }

        return elementsCounterMap;
    }
}
