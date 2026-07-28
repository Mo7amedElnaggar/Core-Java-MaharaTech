import java.util.Scanner;
import java.util.function.Function;

public class QuadraticEquation {

    public void start() {
        Function<double[], double[]> rootsFormula = values -> {
            double newA = values[0], newB = values[1], newC = values[2];

            double sqrt = Math.sqrt((newB * newB) - (4 * newA * newC));
            double firstRoot = (-newB + sqrt) / (2 * newA);
            double secondRoot = (-newB - sqrt) / (2 * newA);

            return new double[]{ firstRoot, secondRoot};
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        double newA = scanner.nextDouble();
        System.out.print("Enter B: ");
        double newB = scanner.nextDouble();
        System.out.print("Enter C: ");
        double newC = scanner.nextDouble();

        double[] formulaResult = rootsFormula.apply(new double[]{newA, newB, newC});
        System.out.println("Equation result Root1: " + formulaResult[0]);
        System.out.println("Equation result Root2: " + formulaResult[1]);
    }
}
