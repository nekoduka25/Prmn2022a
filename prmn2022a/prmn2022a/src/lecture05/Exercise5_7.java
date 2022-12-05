package lecture05;

import java.util.ArrayList;

public class Exercise5_7 {
    public static void main(String[] args) {

        ArrayList<Insect> arrayList = new ArrayList<>();

        arrayList.add(new Insect());
        arrayList.add(new Butterfly());
        arrayList.add(new Lucust());
        arrayList.add(new SwallowtailButterfly());

        for(Insect insect:arrayList){
            insect.move();
        }

    }
}
