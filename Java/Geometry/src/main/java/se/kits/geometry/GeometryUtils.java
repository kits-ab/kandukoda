package se.kits.geometry;

public class GeometryUtils {

    public Double circumferens(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }

    public Double aria(Rectangle rect) {
        return 2 * rect.getWidth() + 2 * rect.getHeight();
    }

    public Double calculateArea(Cube cube) {
        return cube.getSide().getHeight() * cube.getSide().getWidth() * 6;
    }
}
