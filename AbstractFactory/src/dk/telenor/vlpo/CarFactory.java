package dk.telenor.vlpo;

/**
 * Created by vlpo on 22/04/2015.
 */

public interface CarFactory {

    Body createBody();

    Engine createEngine();

    Integer calculatePrice();

}
