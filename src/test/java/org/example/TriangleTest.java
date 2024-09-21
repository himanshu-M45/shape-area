package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void testArea20ForLen8Bre5NormalTriangle() throws Exception {
        double expected = 20.0;
        Triangle triangle = new Triangle(8, 5);

        double actual = triangle.area();

        assertEquals(expected, actual);
    }

    @Test
    void testArea170ForLen17Bre20NormalTriangle() throws Exception {
        double expected = 170.0;
        Triangle triangle = new Triangle(17, 20);

        double actual = triangle.area();

        assertEquals(expected, actual);
    }

    @Test
    void testInputCannotBe0ForSideNormalTriangle() throws Exception {
        assertThrows(Exception.class, () -> new Triangle(0, 0));
    }

    @Test
    void testInputCannotBeNegativeForSideNormalTriangle() throws Exception {
        assertThrows(Exception.class, () -> new Triangle(-9, -8));
    }

    // unit test for right-angle triangle
    @Test
    void testArea20ForA8B9C10RightTriangle() throws Exception {
        double expected = 34.197039345533994;
        Triangle triangle = new Triangle(8, 9, 10);

        double actual = triangle.area();

        assertEquals(expected, actual);
    }

    @Test
    void testArea167ForA17B20C24RightTriangle() throws Exception {
        double expected = 167.63632512078044;
        Triangle triangle = new Triangle(17, 20, 24);

        double actual = triangle.area();

        assertEquals(expected, actual);
    }

    @Test
    void testInputCannotBe0ForSideRightTriangle() throws Exception {
        assertThrows(Exception.class, () -> new Triangle(0, 0, 0));
    }

    @Test
    void testInputCannotBeNegativeForSideRightTriangle() throws Exception {
        assertThrows(Exception.class, () -> new Triangle(-6, -8, -11));
    }
}