import java.util.Random;

public class RandomNumbers {
    private final int arraySize;
    private final int[] arrayOfValues;

    RandomNumbers(int arraySize) {
        this.arraySize = arraySize;
        this.arrayOfValues = new int[arraySize];
    }

    public int[] getRandomArray() {
        Random random = new Random();

        for(int i = 0; i < arraySize; i++) {
            arrayOfValues[i] = random.nextInt();
        }

        return arrayOfValues;
    }
}
