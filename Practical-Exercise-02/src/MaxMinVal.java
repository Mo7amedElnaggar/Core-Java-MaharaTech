public class MaxMinVal {
    private final int[] array;
    private int minimumValue, maximumValue;

    MaxMinVal(int[] array) {
        this.array = array;
        this.proceesArray();
    }

    private void proceesArray() {
        if(array.length > 0)
            minimumValue = maximumValue = array[0];

        for(int item: array) {
            minimumValue = Math.min(minimumValue, item);
            maximumValue = Math.max(maximumValue, item);
        }
    }

    public int getMinimumValue() {
        return minimumValue;
    }

    public  int getMaximumValue() {
        return maximumValue;
    }
}