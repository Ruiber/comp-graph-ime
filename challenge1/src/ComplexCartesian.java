public class ComplexCartesian {

    private double real;
    private double imaginary;

    ComplexCartesian(double real, double imaginary) {
        setReal(real);
        setImaginary(imaginary);
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", getReal(), getImaginary());
    }

    public ComplexCartesian add(ComplexCartesian c) {
        return new ComplexCartesian(getReal() + c.getReal(),
                getImaginary() + c.getImaginary());
    }

    public ComplexCartesian multiply(ComplexCartesian c) {
        double realPart      = getReal()*c.getReal() - getImaginary()*c.getImaginary();
        double imaginaryPart = getImaginary()*c.getReal() + getReal()*c.getImaginary();

        return new ComplexCartesian(realPart, imaginaryPart);
    }

    public ComplexPolar toPolar() {
        double modulus = Math.sqrt(getReal()*getReal() + getImaginary()*getImaginary());
        double argument = Math.atan(getImaginary() / getReal());

        return new ComplexPolar(modulus, argument);
    }

}
