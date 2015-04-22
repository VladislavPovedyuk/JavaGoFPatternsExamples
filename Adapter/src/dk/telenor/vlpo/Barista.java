package dk.telenor.vlpo;

/**
 * Created by vlpo on 22/04/2015.
 */

/**
 * Class which adapts CoffeeMachine class
 */
public class Barista implements Bartender {

    private CoffeeMachine coffeeMachine;

    public Barista() {
        this.coffeeMachine = new CoffeeMachine();
    }

    public void prepareCoffee() {
        coffeeMachine.washCup();
        coffeeMachine.grindCoffeeBeans();
        coffeeMachine.makingCoffee();
    }
}
