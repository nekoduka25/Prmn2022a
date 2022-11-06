package lecture02;

public class GasStation {

    Car car = new Car(0);

    void refuel(){
        car.fuel = car.fuel + 20;
        System.out.println("燃料が20増えました");
    }
}
