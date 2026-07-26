class Main {

    public static void main(String [] args)  {
        // Generate the random numbers of integers
        RandomNumbers numbers = new RandomNumbers(1000);
        int[] arrayOfValues = numbers.getRandomArray();

        // First Approach
        System.out.println("Trying to get maximum number and minimum number in un-ordered array");
        long startTime = System.currentTimeMillis();
        MaxMinVal maxMinVal = new MaxMinVal(arrayOfValues);

        System.out.println("Maximum Value: " + maxMinVal.getMaximumValue());
        System.out.println("Minimum Value: " + maxMinVal.getMinimumValue());

        long endTime = System.currentTimeMillis();
        System.out.println("Time needed to get values: " + ((endTime - startTime) / 1000.0) + " second");

        // Binary Search Approach
        startTime = System.currentTimeMillis();
        BinarySearchTechnique binary = new BinarySearchTechnique(arrayOfValues);
        int binarySearchResult = binary.searchForTarget(0, arrayOfValues.length - 1, 500);

        if(binarySearchResult == -1)
            System.out.println("Target not found");
        else
            System.out.println("Target found at index: " + binarySearchResult);

        endTime = System.currentTimeMillis();
        System.out.println("Time needed to get values: " + ((endTime - startTime) / 1000.0) + " second");
    }
}
