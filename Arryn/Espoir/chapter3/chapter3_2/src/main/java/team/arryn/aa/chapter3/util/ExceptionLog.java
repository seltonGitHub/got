package team.arryn.aa.chapter3.util;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常日志
 */
public class ExceptionLog {
    public static void loging(Exception ex){
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt",true));
        ){
            String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            bw.write(date+"产生异常："+ex.getMessage());
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
