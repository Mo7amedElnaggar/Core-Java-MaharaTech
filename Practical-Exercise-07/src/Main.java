class Main {
    public static void main(String[] args) {
        Complex<Integer> c1 = new Complex<>(15, 12);
        Complex<Integer> c2 = new Complex<>(3, 7);

        ComplexOperation operation = new ComplexOperation();
        System.out.println("Addition: " + operation.add(c1, c2));
        System.out.println("Subtraction: " + operation.subtract(c1, c2));
        System.out.println("Multiplication: " + operation.multiply(c1, c2));
    }
}
