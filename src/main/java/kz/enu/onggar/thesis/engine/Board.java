package kz.enu.onggar.thesis.engine;

import java.util.List;
import java.util.Map;

public class Board {
    private List<Ship> ships;

    private List<VisionBlocker> visionBlockers;

    /**
     * Put ships if first ship see second ship
     */
    private Map<Ship, List<Ship>> visibleShips;

    public void calculateNextFrame() {
        calculateVision();
    }

    private void calculateVision() {
        new VisionCalculator(visibleShips, visionBlockers, ships).calculateVision();
    }

}
