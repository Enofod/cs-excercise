package pl.dkunert.csexcercise.service;

import java.util.HashMap;
import java.util.Map;

// Best case complexity - O(logn) - when there is only one unique element, worst case O(nlogn) - when there are no duplicates
public class BinarySearchSortedArrayElementsCounter extends SortedArrayElementsCounter {

    @Override
    protected Map<Object, Integer> countNumberOfElementsOccurrences(Object[] elements) {

        HashMap<Object, Integer> elementsCounterMap = new HashMap<>();

        int index = 0;

        while (index != elements.length) {
            Object currentValue = elements[index];
            int lastIndexForCurrentValue = binarySearch(elements, index, elements.length - 1, currentValue, index);
            elementsCounterMap.put(currentValue, (lastIndexForCurrentValue - index) + 1);
            index = lastIndexForCurrentValue + 1;
        }

        return elementsCounterMap;
    }

    // returns last index in array of searchedElement
    private int binarySearch(Object[] elements, int leftBound, int rightBound, Object searchedElement, int lastFoundIndexForSearchedElement) {
        int middleIndex = leftBound + (rightBound - leftBound) / 2;

        if (leftBound >= rightBound) {
            if (elements[middleIndex].equals(searchedElement)) {
                return middleIndex;
            }
            return lastFoundIndexForSearchedElement;
        }

        if (elements[middleIndex].equals(searchedElement)) {
            return binarySearch(elements, middleIndex + 1, rightBound, searchedElement, middleIndex);
        }

        return binarySearch(elements, leftBound, middleIndex - 1, searchedElement, lastFoundIndexForSearchedElement);
    }
}
