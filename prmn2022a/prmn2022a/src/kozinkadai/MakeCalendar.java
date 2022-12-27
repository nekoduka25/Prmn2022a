package kozinkadai;

import java.util.Calendar;

public class MakeCalendar {

    public MakeCalendar(){

        Calendar cl = Calendar.getInstance();

        System.out.println("YEAR：" + cl.get(Calendar.YEAR));
        int m = cl.get(Calendar.MONTH) + 1;
        System.out.println("MONTH：" + m);
        System.out.println("DATE：" + cl.get(Calendar.DATE));

        for(int i = 0;i < 70;i++){
            cl.add(Calendar.DATE, 1);
            System.out.println(cl.get(Calendar.DATE));
        }




    }
}
