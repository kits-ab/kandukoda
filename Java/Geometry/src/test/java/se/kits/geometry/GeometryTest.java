package se.kits.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GeometryTest {
    private final GeometryUtils geometryUtils = new GeometryUtils();

    @Test
    void shouldCalculateAreaOfRectangle() {
        final Rectangle rectangle = new Rectangle(3.0, 6.0);
        assertEquals(18.0, geometryUtils.aria(rectangle));
    }

    @Test
    void shouldCalculateCircumferenceOfRectangle() {
        final Rectangle rectangle = new Rectangle(3.0, 6.0);
        assertEquals(18.0, geometryUtils.circumferens(rectangle));
    }

    @Test
    void shouldCalculateCircumferenceOfSquare() {
        final Square square = new Square(4.0);
        assertEquals(16.0, geometryUtils.aria(square));
    }

    @Test
    void shouldCalculateAreaOfSquare() {
        final Square square = new Square(4.0);
        assertEquals(16.0, geometryUtils.aria(square));
    }

    @Test
    void shouldCalculateCubeVol() {
        final Cube cube = new Cube(new Square(4.0));
        assertEquals(96.0, geometryUtils.calculateArea(cube));
    }

    @Test
    void shouldCalculateCubeVolume() {
        final Cube cube = new Cube(new Square(4.0));
        assertEquals(64.0, cube.calculateVolume());
    }
}