package dk.telenor.vlpo;

/**
 * Created by vlpo on 22/04/2015.
 */

public class RaceCarFactory implements CarFactory {

    @Override
    public Body createBody() {
        return new RaceCarBody();
    }

    @Override
    public Engine createEngine() {
        return new RaceCarEngine();
    }

    @Override
    public Integer calculatePrice() {
        return 1000000;
    }
}
