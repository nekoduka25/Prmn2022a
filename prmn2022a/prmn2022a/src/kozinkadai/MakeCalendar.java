package kozinkadai;

import java.util.Calendar;

public class MakeCalendar {

    public MakeCalendar(){

        Calendar cl = Calendar.getInstance();

        int m = cl.get(Calendar.MONTH) + 1;
        System.out.print(m + "/");
        System.out.println(cl.get(Calendar.DATE));

        for(int i = 0;i < 30;i++){
            cl.add(Calendar.DATE, 1);
            int m2 = cl.get(Calendar.MONTH) + 1;
            System.out.print(m2 + "/");
            System.out.println(cl.get(Calendar.DATE));
        }




    }
}
