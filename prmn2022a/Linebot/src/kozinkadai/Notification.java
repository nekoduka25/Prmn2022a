package kozinkadai;

import java.util.Calendar;

public class Notification {
    public Notification() {
        Calendar cl = Calendar.getInstance();

        int m = cl.get(Calendar.MONTH) + 1;
        System.out.print(m + "/");
        System.out.println(cl.get(Calendar.DATE));

        cl.add(Calendar.DATE, 1);
        int m2 = cl.get(Calendar.MONTH) + 1;
        System.out.println(m2 + "/");
        int d2 = cl.get(Calendar.DATE);
        System.out.print(d2);



    }
}

