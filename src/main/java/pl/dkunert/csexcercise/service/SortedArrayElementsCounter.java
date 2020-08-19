package pl.dkunert.csexcercise.service;

import java.util.HashMap;
import java.util.Map;

public abstract class SortedArrayElementsCounter {

    public Map<Object, Integer> solve(Comparable[] elements) {
        if (elements == null || elements.length == 0) {
            return new HashMap<>();
        }

        return calculateElementsCounterMap(elements);
    }

    protected abstract Map<Object, Integer> calculateElementsCounterMap(Comparable[] elements);
}
