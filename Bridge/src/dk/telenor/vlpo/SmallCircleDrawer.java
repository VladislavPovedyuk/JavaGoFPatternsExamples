package dk.telenor.vlpo;

/**
 * Created by vlpo on 22/04/2015.
 */
public class SmallCircleDrawer implements CircleDrawer {

    private static final int  radiusMultiplier = 1;

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing small circle in ( " + x + " ; " + y + " ) and radius = " + radius*radiusMultiplier);
    }
}
