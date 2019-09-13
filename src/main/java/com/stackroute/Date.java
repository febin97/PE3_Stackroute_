package com.stackroute;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    public String getdate(){
        Calendar c  = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("d/M/yyyy");
        String str = "First date of the today week: "+df.format(c.getTime());
        for(int i=0;i<6;i++){
            c.add(Calendar.DATE,1);
        }
        str+= " Last date of the today week: "+df.format(c.getTime())+" ";
        return str;
    }

}
