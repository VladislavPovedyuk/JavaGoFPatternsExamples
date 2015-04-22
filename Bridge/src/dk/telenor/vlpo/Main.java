package dk.telenor.vlpo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vlpo on 22/04/2015.
 */

public class Main {

    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<Shape>() {{
            add(new Circle(5, 10, 10, new SmallCircleDrawer()));
            add(new Circle(20, 5, 12, new LargeCircleDrawer()));
        }};

        for (Shape shape : shapeList) {
            shape.draw();
        }
    }

}
