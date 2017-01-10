package org.bahmni.gauge.util;

import org.bahmni.gauge.data.StoreHelper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public static String stringDoesNotExist(String expected, String actual) {
        return "Expected and Actual text don't match.\nExpected Text : "+expected+"\nActual Text : "+actual;
    }


    /*
    * Generic method to match any pattern and replace/get corresponding data
    *
    *   Pattern 1:
    *   date format: <NOW[simpleDateFormat]>
    *   example: <NOW[dd-MM-yy]>
    *   result: 31-12-95
    *   setDateTime("Date Of Obs: <NOW[dd-MM-yy hh:mm a]>") will give "Date Of Obs: 31-12-95 09:30 PM"
    *
    *   Pattern 2:
    *   <ClassName.VariableName>
    *
    *   Add patterns in this method as required.
    */
    public static String transformPatternToData(String content) {

        //Replace formatted date template with actual date
        String pattern1 = "<NOW\\[(.*)\\]>";
        Matcher matcher = Pattern.compile(".*" + pattern1 + ".*").matcher(content);
        String dateFormat = "dd-MM-yy";
        while (matcher.find()) {
            dateFormat = matcher.group(1);
            SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
            content = content.replaceAll(pattern1, formatter.format(new Date()));
        }

        //Replace Variables with data
        String pattern2 = "<(.+?\\..+?)>";
        matcher = Pattern.compile(pattern2).matcher(content);
        String match = null;
        while (matcher.find()) {
            match = matcher.group(1);
            String className = match.split("\\.")[0];
            String classVar = match.split("\\.")[1];
            String varData = StoreHelper.getVariableInClass(className,classVar);
            content = content.replaceFirst(pattern2, varData);
        }

        return content;
    }

}
