package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testArea20ForLen5Wid8() throws Exception {
        double expected = 40.0;
        Rectangle rectangle = new Rectangle(5, 8);

        double actual = rectangle.area();

        assertEquals(expected, actual);
    }

    @Test
    void testArea240ForLen24Wid10() throws Exception {
        double expected = 240.0;
        Rectangle rectangle = new Rectangle(24, 10);

        double actual = rectangle.area();

        assertEquals(expected, actual);
    }

    @Test
    void testInputCannotBe0Value() throws Exception {
        assertThrows(Exception.class, () -> new Rectangle(0, 0));
    }

    @Test
    void testInputCannotBeNegative() throws Exception {
        assertThrows(Exception.class, () -> new Rectangle(-9, -8));
    }
}