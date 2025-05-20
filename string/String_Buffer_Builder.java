// 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
// appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
// your answer which one is better.


package String;

public class StringBufferBuilder {
    public static void main(String[] args) {
        final int iterations = 10000;
        String textToAppend = "AIET";

        // Test with StringBuffer (Thread-safe)
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(textToAppend);
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");

        // Test with StringBuilder (Not thread-safe but faster)
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(textToAppend);
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        // Justification
        if (durationBuilder < durationBuffer) {
            System.out.println("\nStringBuilder is faster and more efficient for single-threaded operations.");
        } else {
            System.out.println("\nStringBuffer is slower due to synchronization, but it is thread-safe.");
        }
    }
}
