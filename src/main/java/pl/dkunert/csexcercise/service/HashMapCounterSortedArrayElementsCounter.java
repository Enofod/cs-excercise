package pl.dkunert.csexcercise.service;

import java.util.HashMap;
import java.util.Map;

// One map call per element
public class HashMapCounterSortedArrayElementsCounter extends SortedArrayElementsCounter {

    @Override
    protected Map<Object, Integer> calculateElementsCounterMap(Comparable[] elements) {

        HashMap<Object, Integer> elementsCounterMap = new HashMap<>();

        Object previous = elements[0];
        int count = 1;
        for (int i = 1; i < elements.length; i++) {
            Object current = elements[i];
            if (previous.equals(current)) {
                count++;
            } else {
                elementsCounterMap.put(previous, count);
                count = 1;
            }
            previous = current;
        }

        elementsCounterMap.put(previous, count);

        return elementsCounterMap;
    }
}
