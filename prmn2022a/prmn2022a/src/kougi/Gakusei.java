package kougi;

public class Gakusei {

    public String gakuseki;
    public String shimei;
    public int nenrei;

    public Gakusei(String gakuseki,String shimei,int nenrei){

        this.gakuseki = gakuseki;
        this.shimei = shimei;
        this.nenrei = nenrei;
    }

    public void handan(){

        if(this.nenrei >= 20){

            System.out.println(this.shimei + "は成人です" );

        }else{

            System.out.println(this.shimei + "は未成年です");

        }
    }
}