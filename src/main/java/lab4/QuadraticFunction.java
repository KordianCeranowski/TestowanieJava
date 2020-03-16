package lab4;
import java.io.Serializable;

public final class QuadraticFunction implements Serializable {
    private final double a;
    private final double b;
    private final double c;
    private final double x1;
    private final double x2;

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public QuadraticFunction(final double a, final double b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if(a == 0 && b == 0 && c == 0){
            throw new IllegalArgumentException("Every argument for these parameters is a solution");
        }
        if(a == 0 && b == 0){
            throw new IllegalArgumentException("No real solution for these parameters");
        }
        final double delta = b * b - 4 * a * c;
        if (delta > 0) {
            x1 = (-b - delta) / 2 * a;
            x2 = (-b + delta) / 2 * a;
        }
        else if (delta == 0) {
            x1 = x2 = -b / 2 / a;
        }
        else {
            throw new IllegalArgumentException("No real solution for these parameters");
        }
    }
}
