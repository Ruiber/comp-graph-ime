public class ComplexPolar {

    private double modulus;
    private double argument;

    ComplexPolar(double modulus, double argument) {
        setModulus(modulus);
        setArgument(argument);
    }

    public void setModulus(double modulus) {
        this.modulus = modulus;
    }

    public double getModulus() {
        return modulus;
    }

    public void setArgument(double argument) {
        this.argument = argument;
    }

    public double getArgument() {
        return argument;
    }

    @Override
    public String toString() {
        return String.format("%.2fe^%.2fi", getModulus(), getArgument());
    }

    public ComplexCartesian toCartesian() {
        double real      = getModulus() * Math.cos(getArgument());
        double imaginary = getModulus() * Math.sin(getArgument());

        return new ComplexCartesian(real, imaginary);
    }

    public ComplexPolar add(ComplexPolar c) {
        ComplexCartesian c1 = toCartesian();
        ComplexCartesian c2 = c.toCartesian();

        return (c1.add(c2)).toPolar();
    }

    public ComplexPolar multiply(ComplexPolar c) {
        return new ComplexPolar(getModulus()*c.getModulus(),
                getArgument()+c.getArgument());
    }

}
