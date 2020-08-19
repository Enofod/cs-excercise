package pl.dkunert.csexcercise.service;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

abstract class SortedArrayElementsCounterTest {

    private SortedArrayElementsCounter underTest;

    public SortedArrayElementsCounterTest(SortedArrayElementsCounter underTest) {
        this.underTest = underTest;
    }

    @Test
    void nullInput() {
        // given
        Comparable[] inputData = null;
        Map<Object, Integer> expectedResult = new HashMap<>();

        // when
        Map<Object, Integer> result = underTest.solve(inputData);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void emptyInput() {
        // given
        Comparable[] inputData = new Comparable[] {};
        Map<Object, Integer> expectedResult = new HashMap<>();

        // when
        Map<Object, Integer> result = underTest.solve(inputData);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void oneElement() {
        // given
        Comparable[] inputData = new Comparable[] {"a"};
        Map<Object, Integer> expectedResult = new HashMap<>();
        expectedResult.put("a", 1);

        // when
        Map<Object, Integer> result = underTest.solve(inputData);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void oneElementPerEntity() {
        // given
        Comparable[] inputData = new Comparable[] {"a", "b", "c"};
        Map<Object, Integer> expectedResult = new HashMap<>();
        expectedResult.put("a", 1);
        expectedResult.put("b", 1);
        expectedResult.put("c", 1);

        // when
        Map<Object, Integer> result = underTest.solve(inputData);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void multipleElementPerEntity() {
        // given
        Comparable[] inputData = new Comparable[] {"a","b","b","b","b","b","d","h","h","h","p"};
        Map<Object, Integer> expectedResult = new HashMap<>();
        expectedResult.put("a", 1);
        expectedResult.put("b", 5);
        expectedResult.put("d", 1);
        expectedResult.put("h", 3);
        expectedResult.put("p", 1);

        // when
        Map<Object, Integer> result = underTest.solve(inputData);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    // TODO: Add randomly generated data

}