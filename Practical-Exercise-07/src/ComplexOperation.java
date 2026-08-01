interface ComplexOperationType<T extends Number> {
    Complex<T> add(Complex<T> c1, Complex<T> c2);
    Complex<T> subtract(Complex<T> c1, Complex<T> c2);
    Complex<T> multiply(Complex<T> c1, Complex<T> c2);
}

class ComplexOperation implements ComplexOperationType {
    @Override
    public Complex add(Complex c1, Complex c2) {
        double first = c1.getT1().doubleValue() + c2.getT1().doubleValue();
        double second = c1.getT2().doubleValue() + c2.getT2().doubleValue();
        return new Complex(first, second);
    }

    @Override
    public Complex subtract(Complex c1, Complex c2) {
        double first = c1.getT1().doubleValue() - c2.getT1().doubleValue();
        double second = c1.getT2().doubleValue() - c2.getT2().doubleValue();
        return new Complex(first, second);
    }

    @Override
    public Complex multiply(Complex c1, Complex c2) {
        double first = (c1.getT1().doubleValue() * c2.getT1().doubleValue()) - ((c1.getT2().doubleValue() * c2.getT2().doubleValue()));
        double second = ((c1.getT1().doubleValue() * c2.getT2().doubleValue()) - (c1.getT2().doubleValue() * c2.getT1().doubleValue()));
        return new Complex(first, second);
    }
}
