package org.example;

public class Triangle extends Shape {
    private final Double height;
    private final Double breadth;
    private final Double a;
    private final Double b;
    private final Double c;

    public Triangle(double height, double breadth) throws Exception {
        if (height <= 0 || breadth <= 0) {
            throw new Exception("Input should be a non zero positive value");
        }
        this.height = height;
        this.breadth = breadth;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public Triangle(double a, double b, double c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("Input should be a non zero positive value");
        }
        this.height = null;
        this.breadth = null;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        if (height == null) {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return 0.5 * height * breadth;
    }
}
