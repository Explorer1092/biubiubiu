package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    public boolean containsTime() {
        SimpleDateFormat sdfm;
        SimpleDateFormat sdfh;
        SimpleDateFormat sdfDate;
        String mm;
        String hh;
        String d;
        Integer hour;
        Integer min;
        Boolean flag = false;
        Date date = new Date();
        sdfm = new SimpleDateFormat("mm");
        sdfh = new SimpleDateFormat("HH");
        sdfDate = new SimpleDateFormat("yyyy-MM-dd");
        d = sdfDate.format(date);
        mm = sdfm.format(date);
        hh = sdfh.format(date);
        hour = Integer.parseInt(hh);
        min = Integer.parseInt(mm);
//        if (hour<=8){
//            flag = true;
//        }else if (hour>8&&hour<22){
//            flag = false;
//        }
        return flag;
    }


    public Long bookForTime() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdfm = new SimpleDateFormat("mm");
        SimpleDateFormat sdfh = new SimpleDateFormat("HH");
//        SimpleDateFormat sdfs = new SimpleDateFormat("ss");
        SimpleDateFormat sdfd = new SimpleDateFormat("dd");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
        String d = sdfDate.format(date);
        String mm = sdfm.format(date);
        String hh = sdfh.format(date);
        String dd = sdfd.format(date);
//        String ss = sdfs.format(date);
        Integer hour = Integer.parseInt(hh);
        Integer min = Integer.parseInt(mm);
        Integer dayy = Integer.parseInt(dd)+1;
        if (min>=28&&min<58){
            hour=hour+1;
            min=0;
        }else if(min>0&&min<28){
            min=30;
        }else if (min>=58&&min<60){
            hour=hour+1;
            min=30;
        }

        String curTime = d+" "+hour+":"+min+":"+00;
        SimpleDateFormat sdfBookTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date bookTime = sdfBookTime.parse(curTime);
        System.out.println(bookTime);
        Long ts = bookTime.getTime();
        System.out.println("**********************day:"+dayy);
        System.out.println("******************timesamp:"+ts);
        return ts;
    }



    public static void main(String[] args) throws ParseException {
        TimeUtils st = new TimeUtils();
        st.bookForTime();
    }
}


