package A;

public class a {
    public static void main(String[] args) {


        int month = 1;
        for(int j = 1;j < 13;j++){

            System.out.println(j + "月");

            int day = 1;

            while(true){
                for(int i = 1;i < 8;i++){
                    if(day < 32){
                        if(day < 10){
                            System.out.print(" ");
                        }
                        System.out.print(day);
                        System.out.print(" ");

                        day = day + 1;
                    }else{
                        System.out.println("");

                        break;
                    }
                }
                System.out.println("");
                if(day > 31){
                    break;
                }
            }
        }


    }
}

