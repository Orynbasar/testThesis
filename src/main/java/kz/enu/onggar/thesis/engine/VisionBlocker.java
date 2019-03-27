package kz.enu.onggar.thesis.engine;


import java.util.List;

public interface VisionBlocker {

    Point getCenterPoint();

    int getAngle();

    List<Point> getCornerPoints();
}