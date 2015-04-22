package dk.telenor.vlpo;

/**
 * Created by vlpo on 22/04/2015.
 */

public class Car {

    private Body body;
    private Engine engine;
    private Integer price;

    public Car() {

    }

    public Car(Body body, Engine engine, Integer price) {
        this.body = body;
        this.engine = engine;
        this.price = price;
    }

    @Override
    public String toString() {
        return "This car has: " + body + ", " + engine +  " and costs - " + price + " UAH";
    }
}
