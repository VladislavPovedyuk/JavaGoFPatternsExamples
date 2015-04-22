package dk.telenor.vlpo;

public class Main {

    public static void main(String[] args) {
        createCar(new CheapCarFactory());
        createCar(new RaceCarFactory());
    }

    public static void createCar(CarFactory carFactory){
        Car car = new Car(carFactory.createBody(), carFactory.createEngine(), carFactory.calculatePrice());
        System.out.println(car);
    }
}
