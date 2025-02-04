package COW2;

public class Cop {
    public boolean areTheySpeeding(double speed, double speedLimit) {
        if (speed > speedLimit) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isItRecklessDriving(double speed, double speedLimit, boolean isOnHighway) {
        if ((isOnHighway && speed >= speedLimit + 20) || (!isOnHighway && speed >= speedLimit + 10)) {
            return true;
        } else {
            return false;
        }
    }

    public double whatsTheFine(double speed, double speedLimit, boolean isOnHighway) {
        if (!areTheySpeeding(speed, speedLimit)) {
            return 0;
        } else if (isItRecklessDriving(speed, speedLimit, isOnHighway)) {
            return 5000;
        } else {
            return 120 + 10 * (speed - speedLimit);
        }
    }
}
