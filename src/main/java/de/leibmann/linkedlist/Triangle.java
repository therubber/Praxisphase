package de.leibmann.linkedlist;

import java.util.Objects;

public class Triangle implements Figure {
    private double a;
    private String type = "Triangle";

    public Triangle(double a) {
        this.a = a;
    } // end of constructor

    public String dimensions() {
        return "a: " + this.a;
    } // end of dimensions

    public double area() {
        return a * Math.sqrt(Math.pow(a, 2) + Math.pow(a / 2, 2));
    } // end of area

    public double circumference() {
        return 3 * a;
    } // end of circumference

    public String type() {
        return this.type;
    } // end of

    @Override
    public String toString() {
        return "Triangle with side length " + a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Objects.equals(type, triangle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, type);
    }
}
