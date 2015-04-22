package dk.telenor.vlpo;

/**
 * Created by vlpo on 22/04/2015.
 */

public class CheapCarFactory implements CarFactory{

    @Override
    public Body createBody() {
        return new CheapCarBody();
    }

    @Override
    public Engine createEngine() {
        return new CheapCarEngine();
    }

    @Override
    public Integer calculatePrice() {
        return 1000;
    }

}
