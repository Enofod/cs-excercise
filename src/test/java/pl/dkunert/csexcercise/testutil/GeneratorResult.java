package pl.dkunert.csexcercise.testutil;

import java.util.Map;

public class GeneratorResult {

    private Object[] inputData;
    private Map<Object, Integer> expectedResult;

    public GeneratorResult(Object[] inputData, Map<Object, Integer> expectedResult) {
        this.inputData = inputData;
        this.expectedResult = expectedResult;
    }

    public Object[] getInputData() {
        return inputData;
    }

    public Map<Object, Integer> getExpectedResult() {
        return expectedResult;
    }

}
