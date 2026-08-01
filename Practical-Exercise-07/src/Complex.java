public class Complex<T extends Number> {
    private T t1, t2;

    Complex(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T getT1() {
        return t1;
    }

    public T getT2() {
        return t2;
    }

    @Override
    public String toString() {
        return t1 + " + " + t2;
    }
}
