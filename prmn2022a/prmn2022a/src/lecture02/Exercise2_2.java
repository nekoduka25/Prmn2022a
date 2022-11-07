package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {

        Car car = new Car(0);
        GasStation gas = new GasStation();

        car.run();
        gas.refuel(car);
        car.run();



    }
}
