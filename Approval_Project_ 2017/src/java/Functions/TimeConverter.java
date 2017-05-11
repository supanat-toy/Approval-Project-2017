/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SONY
 */
public class TimeConverter {
    public java.sql.Timestamp dateStringtoDate(String date){
        if(date.contains("/")){
            date = dateFormat(date);
            int i = 0;
        }
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        java.sql.Timestamp d = null;
        try {
            d = new java.sql.Timestamp(format.parse(date).getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }
    public String dateToString(Date d){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String date = df.format(d);
        return date;
    }
    public String dateFormat(String date){
        String[] arr = date.split(" ");
        String[] d = arr[0].split("/");
        String _d = d[2] + "-" + d[1] + "-" + d[0] + " " + arr[1];
        return _d;
    }
    public String timeFormat(String time){
        String t = "";
        return t;
    }
    public String dateForShow(String date){
        String date2 = date;
        String[] arr = date2.split(" ")[0].split("-");
        String toReturn = arr[2];
        for(int i = 1; i > -1; i--){
            toReturn += "/" + arr[i];
        }
        return toReturn;
    }
    
    public String timeForShow(String date){
        String date2 = date;
        String s = date2.split(" ")[1];
        String[] arr2 = s.split(":");
        String toReturn = arr2[0] + ":" + arr2[1];
//        for(int i = 1; i < 2; ++i){
//            toReturn += ":" + arr2[i];
//        };
        return toReturn;
    }
}
