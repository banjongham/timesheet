package com.example.timesheet.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Locale;

@Component
public class Common {

    public Boolean checkEmpty(Object data){
        Boolean response = true;
        if(null == data || "".equals(data)){
            response = false;
        }
        return response;
    }

    public Boolean checkNotEmpty(Object data){
        Boolean response = false;
        if(null == data || "".equals(data)){
            response = true;
        }
        return response;
    }

    public Boolean checkNotEmptyInteger(Integer data) {
        Boolean response = false;
        if(null == data) {
            response = true;
        }
        return response;
    }

    public String[] spliteData(String data , String regex) {
        String[] parts = data.split(regex);
        return parts;
    }

    public String parseDataFormatLocalUS(String date) throws Exception {
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        SimpleDateFormat sf2 = new SimpleDateFormat("dd/MM/yyyy", Locale.US);

        return sf2.format(sf1.parse(date));
    }

    public String parseDataFormatLocalHMSUS(String date) throws Exception {
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        SimpleDateFormat sf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.US);

        return sf2.format(sf1.parse(date));
    }
}
