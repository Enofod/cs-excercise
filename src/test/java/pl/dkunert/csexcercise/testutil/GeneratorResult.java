package pl.dkunert.csexcercise.testutil;

import java.util.Map;

public class GeneratorResult {

    private Comparable[] inputData;
    private Map<Object, Integer> expectedResult;

    public GeneratorResult(Comparable[] inputData, Map<Object, Integer> expectedResult) {
        this.inputData = inputData;
        this.expectedResult = expectedResult;
    }

    public Comparable[] getInputData() {
        return inputData;
    }

    public Map<Object, Integer> getExpectedResult() {
        return expectedResult;
    }

}
