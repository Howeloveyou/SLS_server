package cn.howe.ujs.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static Date stringToDate(String strDate) throws ParseException {
        strDate = strDate.replace("Z", " UTC");//注意是空格+UTC
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");//注意格式化的表达式
        return format.parse(strDate);
    }

    public static Date stringToDate(String strDate,String str) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(str);//注意格式化的表达式
        return format.parse(strDate);
    }

    public static String timeToStr(java.util.Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return  formatter.format(date);
    }

}
