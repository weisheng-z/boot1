package com.codefei.boot2.config;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormater implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        System.out.println("日期转换！！！！");
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return f.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        return null;
    }
}
