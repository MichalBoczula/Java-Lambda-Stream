package stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Numbers implements ArrayOperations {
    @Override
    public OptionalDouble getAverage(int[] numbers) {

        OptionalDouble avr = IntStream.range(0, numbers.length)
                .average();

        return avr;
    }
}
