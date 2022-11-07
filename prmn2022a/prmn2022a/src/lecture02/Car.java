package lecture02;

public class Car {
    int fuel;
    Tire[] tires;
    Engine engine;

    Car(Tire[] tires,Engine engine){
        this.tires = tires;
        this.engine = engine;
        this.fuel = 0;

    }

    void startEngine(){
        engine.start();
    }



    void run(){

        if(this.fuel > 0) {
            this.fuel = this.fuel - 1;
            System.out.println("燃料を1消費して走りました");

        }else{
            System.out.println("燃料がありません");
        }

    }
}
