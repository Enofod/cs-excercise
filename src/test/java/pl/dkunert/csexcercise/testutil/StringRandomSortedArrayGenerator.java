package pl.dkunert.csexcercise.testutil;

import java.util.*;

public class StringRandomSortedArrayGenerator extends RandomSortedArrayGenerator {

    @Override
    public GeneratorResult generateTestData(int numberOfMaxUniqueObjects, int numberOfTotalObjects) {
        String[] uniqueObject = new String[numberOfMaxUniqueObjects];
        Map<Object, Integer> expectedResult = new HashMap<>();

        for (int i = 0; i < uniqueObject.length; i++) {
            uniqueObject[i] = UUID.randomUUID().toString();
        }

        Comparable[] testData  = new Comparable[numberOfTotalObjects];
        Random random = new Random();


        for (int i = 0; i < testData.length; i++) {
            String element = uniqueObject[random.nextInt(numberOfMaxUniqueObjects)];
            testData[i] = element;
            expectedResult.compute(element, (k, v) -> (v == null) ? 1 : v + 1);
        }

        Arrays.sort(testData);

        return new GeneratorResult(testData, expectedResult);
    }
}
