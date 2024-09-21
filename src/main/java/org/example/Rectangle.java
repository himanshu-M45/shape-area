package org.example;

public class Rectangle extends Shape {
    private final Double length;
    private final Double width;
    private final Double side;

    public Rectangle(double length, double width) throws Exception {
        if (length <= 0 || width <= 0) {
            throw new Exception("Input should be a non zero positive value");
        }
        this.length = length;
        this.width = width;
        this.side = null;
    }

    public Rectangle(double side) throws Exception {
        if (side <= 0) {
            throw new Exception("Input should be a non zero positive value");
        }
        this.length = null;
        this.width = null;
        this.side = side;
    }

    @Override
    public double area() {
        if(length == null) return side * side;

        return length * width;
    }
}
