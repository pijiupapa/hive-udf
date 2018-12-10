package com.bestmind.data.hive.udf;

import com.google.common.base.Strings;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat extends UDF {
    private final Text result = new Text();
    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");


    public Text evaluate(Text src) {
        try {
            Date date  = format.parse(src.toString());
            result.set(format1.format(date));
        } catch (ParseException err) {
            return result;
        }
        return result;
    }
}
