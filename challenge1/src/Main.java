public class Main {

    public static void main(String[] args) {
        // Cartesian complex cases
        ComplexCartesian c1 = new ComplexCartesian(2, 3);
        ComplexCartesian c2 = new ComplexCartesian(-5, 2);
        ComplexCartesian c3 = c1.add(c2);
        ComplexCartesian c4 = c1.multiply(c2);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println();

        System.out.println("c1 + c2 = (" + c1 + ") + (" + c2 + ") = " + c3);
        System.out.println("c1 * c2 = (" + c1 + ") * (" + c2 + ") = " + c4);

        System.out.println();

        // Cartesian to polar
        ComplexCartesian c5 = new ComplexCartesian(3, 4);
        System.out.println("c5 = " + c5 + " = " + c5.toPolar());

        // Polar to cartesian
        ComplexPolar c6 = new ComplexPolar(5, Math.atan(4.0/3));
        System.out.println("c6 = " + c6 + " = " + c6.toCartesian());

        System.out.println();

        // Polar complex cases
        ComplexPolar c7 = new ComplexPolar(6, Math.PI/2);
        ComplexPolar c8 = new ComplexPolar(8, 0);
        ComplexPolar c9 = c7.add(c8);
        ComplexPolar c10 = c7.multiply(c8);

        System.out.println("c7 = " + c7 + " = " + c7.toCartesian());
        System.out.println("c8 = " + c8 + " = " + c8.toCartesian());

        System.out.println();

        System.out.println("c9 = c7 + c8 = " + c7 + " + " + c8 + " = " + c9 + " = " + c9.toCartesian());
        System.out.println("c10 = c7 * c8 = " + c7 + " * " + c8 + " = " + c10 + " = " + c10.toCartesian());

    }

}
