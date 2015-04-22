package dk.telenor.vlpo;

/**
 * Created by vlpo on 22/04/2015.
 */

public abstract class Shape {

    protected CircleDrawer drawer;

    protected Shape(CircleDrawer drawer) {
        this.drawer = drawer;
    }

    public abstract void draw();

    public abstract void enlargeRadius(int multiplier);

}
