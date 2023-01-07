package kozinkadai;

import java.util.Calendar;

public class MakeCalendar {

    public MakeCalendar(){

        MakeFolder mfo = new MakeFolder();
        mfo.makemainfolder();

        Calendar cl = Calendar.getInstance();

        int m = cl.get(Calendar.MONTH) + 1;
        System.out.print(m + "/");
        System.out.println(cl.get(Calendar.DATE));

        for(int i = 0;i < 30;i++){
            cl.add(Calendar.DATE, 1);
            int m2 = cl.get(Calendar.MONTH) + 1;
            System.out.print(m2 + "/");
            int d2 = cl.get(Calendar.DATE);
            System.out.print(d2);
            mfo.makesubfolder(d2,m2);
            MakeFile mf = new MakeFile();
            mf.maketxt(d2,m2);
            ReadText rd = new ReadText(d2,m2);
            System.out.println("");
        }



    }
}