package pl.dkunert.csexcercise.service;

import java.util.HashMap;
import java.util.Map;

// Multiple map call per element
public class HashMapComputeAllSortedArrayElementsCounter extends SortedArrayElementsCounter {

    @Override
    protected Map<Object, Integer> calculateElementsCounterMap(Comparable[] elements) {

        HashMap<Object, Integer> elementsCounterMap = new HashMap<>();

        for (Object element : elements) {
            elementsCounterMap.compute(element, (k, v) -> (v == null) ? 1 : v + 1);
        }

        return elementsCounterMap;
    }
}
