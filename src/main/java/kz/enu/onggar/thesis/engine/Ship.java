package kz.enu.onggar.thesis.engine;

import java.util.List;

public class Ship implements VisionBlocker {

    private Point centerPoint;
    private int angle;
    private List<Point> cornerPoints;

    public Ship(Point centerPoint, int angle, List<Point> cornerPoints) {
        this.centerPoint = centerPoint;
        this.angle = angle;
        this.cornerPoints = cornerPoints;
    }

    public Ship(Point centerPoint, List<Point> cornerPoints) {
        this.centerPoint = centerPoint;
        this.angle = 90_000;
        this.cornerPoints = cornerPoints;
    }

    @Override
    public Point getCenterPoint() {
        return centerPoint;
    }

    @Override
    public int getAngle() {
        return angle;
    }

    @Override
    public List<Point> getCornerPoints() {
        return cornerPoints;
    }
}
