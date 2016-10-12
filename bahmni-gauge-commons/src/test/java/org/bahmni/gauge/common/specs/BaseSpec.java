package org.bahmni.gauge.common.specs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BaseSpec {
    static String stringDoesNotExist(String content) {
        return "String `" + content + "` does not exist";
    }

    /*
    *   date format: <NOW[simpleDateFormat]>
    *   example: <NOW[dd-MM-yy]>
    *   result: 31-12-95
    *   setDateTime("Date Of Obs: <NOW[dd-MM-yy hh:mm a]>") will give "Date Of Obs: 31-12-95 09:30 PM"
    */

    static String setDateTime(String content) {
        String pattern = "<NOW\\[(.*)\\]>";
        Matcher matcher = Pattern.compile(".*" + pattern + ".*").matcher(content);
        String dateFormat = "dd-MM-yy";
        while (matcher.find()) {
            dateFormat = matcher.group(1);
        }
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        return content.replaceAll(pattern, formatter.format(new Date()));
    }
}