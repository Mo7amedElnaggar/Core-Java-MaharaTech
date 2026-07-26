import java.util.Arrays;

public class BinarySearchTechnique {
    private int[] array;

    BinarySearchTechnique(int [] array) {
        this.array = array;
        this.sortArray();
    }

    private void sortArray() {
        Arrays.sort(this.array);
    }

    // Recursive method
    final int searchForTarget(int leftSide, int rightSide, int target) {
        if(leftSide > rightSide)
            return -1;

        int middleIndex = (leftSide + rightSide) / 2;

        if(array[middleIndex] > target)
            return searchForTarget(leftSide, middleIndex - 1, target);
        else if(array[middleIndex] < target)
            return searchForTarget(middleIndex + 1, rightSide, target);

        return middleIndex;
    }
}
