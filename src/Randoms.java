import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected final Random random;
    protected final int min;
    protected final int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            int lastInt = 0;

            @Override
            public boolean hasNext() {
                return lastInt != max;
            }

            @Override
            public Integer next() {
                lastInt = min + random.nextInt(max - min + 1);
                return lastInt;
            }
        };
    }
}