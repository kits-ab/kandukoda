package se.kits.geometry;

public class Cube implements Volume {

    public Square side;

    public Cube(Square side) {
        this.side = side;
    }

    public Square getSide() {
        return side;
    }

    public void setSide(Square side) {
        this.side = side;
    }

    public Double calculateVolume() {
        return side.getWidth() * side.getHeight() * side.getHeight();
    }
}
