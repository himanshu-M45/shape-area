package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testArea64ForSide8() throws Exception {
        double expected = 64;
        Rectangle square = new Rectangle(8);

        double actual = square.area();

        assertEquals(expected, actual);
    }

    @Test
    void testArea31684ForSide178() throws Exception {
        double expected = 31684.0;
        Rectangle square = new Rectangle(178);

        double actual = square.area();

        assertEquals(expected, actual);
    }

    @Test
    void testInputCannotBe0ForSide() throws Exception {
        assertThrows(Exception.class, () -> new Rectangle(0));
    }

    @Test
    void testInputCannotBeNegativeForSide() throws Exception {
        assertThrows(Exception.class, () -> new Rectangle(-1));
    }
}