package lecture02;

public class Car {
    int fuel;

    Car(int fuel){
        this.fuel = 0;

    }

    void run(){
        fuel = fuel - 1;
        if(fuel > 0) {
            System.out.println("燃料を1消費して走りました");
        }else{
            System.out.println("燃料がありません");
        }

    }
}
