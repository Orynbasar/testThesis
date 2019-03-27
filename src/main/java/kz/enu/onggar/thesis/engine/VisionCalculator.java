package kz.enu.onggar.thesis.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class VisionCalculator {
    private Map<Ship, List<Ship>> visibleShips;
    private List<VisionBlocker> visionBlockers;
    private List<Ship> ships;

    VisionCalculator(Map<Ship, List<Ship>> visibleShips, List<VisionBlocker> visionBlockers, List<Ship> ships) {
        this.visibleShips = visibleShips;
        this.visionBlockers = visionBlockers;
        this.ships = ships;
    }

    void calculateVision() {
        ships.forEach(firstShip -> {
            visibleShips.put(firstShip, new ArrayList<>());
            ships.forEach(secondShip -> {
                if (firstSheepSeeSecondShip(firstShip, secondShip)) {
                    visibleShips.get(firstShip).add(secondShip);
                }
            });
        });
    }

    private boolean firstSheepSeeSecondShip(Ship firstShip, Ship secondShip) {
        return true;
    }

}
