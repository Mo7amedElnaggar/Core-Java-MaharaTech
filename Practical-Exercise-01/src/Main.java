import java.util.Scanner;

class Main {

    public static void main(String [] args) {
        // Display a message to command prompt
        System.out.println("Practical Exercise 01");

        Scanner scanner = new Scanner(System.in);

        // Receive an input
        System.out.print("Enter your name: ");
        String clientName = scanner.nextLine();
        System.out.println("Welcome to our exercise, " + clientName + "!");

        // Receive 2 inputs number and string and print string
        // according to given number
        System.out.print("Enter your String: ");
        String word = scanner.nextLine();

        System.out.print("Enter a number to repeat your String: ");
        int numberOfTimes = scanner.nextInt();

        for(int i = 0; i < numberOfTimes; i++) {
            System.out.println(word);
        }

        scanner.close();
    }
}
