package pl.dkunert.csexcercise.service;

import java.util.HashMap;
import java.util.Map;

public class BinarySearchSortedArrayElementsCounter extends SortedArrayElementsCounter {

    @Override
    protected Map<Object, Integer> calculateElementsCounterMap(Comparable[] elements) {

        HashMap<Object, Integer> elementsCounterMap = new HashMap<>();

        int index = 0;

        while (index != elements.length) {
            Comparable currentValue = elements[index];
            int lastIndexForCurrentValue = binarySearch(elements, index, elements.length - 1, currentValue, index);
            elementsCounterMap.put(currentValue, (lastIndexForCurrentValue - index) + 1);
            index = lastIndexForCurrentValue + 1;
        }

        return elementsCounterMap;
    }

    // returns index of element
    private int binarySearch(Comparable[] elements, int leftBound, int rightBound, Object searchedElement, int lastFoundIndexForSearchedElement) {
        if (leftBound >= rightBound) {
            return lastFoundIndexForSearchedElement;
        }

        int middleIndex = leftBound + (rightBound - leftBound) / 2;

        if (elements[middleIndex].equals(searchedElement)) {
            return binarySearch(elements, middleIndex + 1, rightBound, searchedElement, middleIndex);
        }

        if (elements[middleIndex].compareTo(searchedElement) > 0) {
            return binarySearch(elements, leftBound, middleIndex - 1, searchedElement, lastFoundIndexForSearchedElement);
        }

        return binarySearch(elements, middleIndex + 1, rightBound, searchedElement, lastFoundIndexForSearchedElement);
    }
}
