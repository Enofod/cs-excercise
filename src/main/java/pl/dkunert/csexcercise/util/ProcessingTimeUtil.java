package pl.dkunert.csexcercise.util;

public class ProcessingTimeUtil {

    private final long startTime;

    public ProcessingTimeUtil() {
        startTime = System.nanoTime();
    }

    public long getProcessingTimeInNanos() {
        return System.nanoTime() - startTime;
    }
}
