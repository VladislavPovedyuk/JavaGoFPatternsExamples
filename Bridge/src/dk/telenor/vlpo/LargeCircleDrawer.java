package dk.telenor.vlpo;

/**
 * Created by vlpo on 22/04/2015.
 */

public class LargeCircleDrawer implements CircleDrawer {

    private static final int  radiusMultiplier = 20;

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing large circle in ( " + x + " ; " + y + " ) and radius = " + radius*radiusMultiplier);
    }

}
