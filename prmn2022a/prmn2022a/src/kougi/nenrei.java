package kougi;

public class nenrei {

    private int value;

    public nenrei(int value){

        if(value >= 0&&value < 120){

            this.value = value;

        }else{

            System.out.println("エラー");
        }
    }
}
