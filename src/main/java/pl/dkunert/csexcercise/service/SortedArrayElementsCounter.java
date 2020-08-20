package pl.dkunert.csexcercise.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.dkunert.csexcercise.util.ProcessingTimeUtil;

import java.util.HashMap;
import java.util.Map;

public abstract class SortedArrayElementsCounter {

    private static Logger logger = LoggerFactory.getLogger(SortedArrayElementsCounter.class);

    public Map<Object, Integer> solve(Comparable[] elements) {
        ProcessingTimeUtil processingTimeUtil = new ProcessingTimeUtil();

        if (elements == null || elements.length == 0) {
            return new HashMap<>();
        }

        Map<Object, Integer> result = countNumberOfElementsOccurrences(elements);

        logger.info("Processed {} elements in {} nanoseconds using {} class ", elements.length, processingTimeUtil.getProcessingTimeInNanos(), this.getClass());
        return result;
    }

    protected abstract Map<Object, Integer> countNumberOfElementsOccurrences(Comparable[] elements);
}
