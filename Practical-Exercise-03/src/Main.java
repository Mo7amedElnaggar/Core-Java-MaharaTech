import java.util.Scanner;

class Main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your sentense: ");
        String sentense = scanner.nextLine();
        System.out.print("Please enter your word you want to search for: ");
        String word = scanner.nextLine();

        System.out.println("Number of occurence: " + numberOfOccurrences(sentense, word));
    }

    private static int numberOfOccurrences(String sentense, String word) {
        String [] multipeWords = sentense.split("\\s+");
        int occurenceCount = 0;

        for(String item: multipeWords) {
            if(item.equals(word))
                occurenceCount++;
        }

        return occurenceCount;
    }
}
