import java.util.Scanner;
import java.util.function.Function;

public class FahrenheitConversion {

    public void star() {
        // Define function
        Function<Double, Double> fahrenheitConversion = celsius -> (celsius * 9 / 5) + 32;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in centigrade: ");

        Double celsius = scanner.nextDouble();
        System.out.println("Convert: " + celsius + " °C" + " to Fahrenheit: " + fahrenheitConversion.apply(celsius) + " °F");

    }

}
