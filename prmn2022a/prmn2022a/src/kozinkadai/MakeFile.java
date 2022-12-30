package kozinkadai;


import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class MakeFile {

   public MakeFile(){
       try{
           File file = new File("c:\\test.txt");

           if (checkBeforeWritefile(file)){
               PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

               pw.close();
           }else{
               System.out.println("ファイルに書き込めません");
           }
       }catch(IOException e){
           System.out.println(e);
       }
   }

    private static boolean checkBeforeWritefile(File file){

        if (file.exists()){
            if (file.isFile() && file.canWrite()){
                return true;
            }
        }

        return false;
   }
}
