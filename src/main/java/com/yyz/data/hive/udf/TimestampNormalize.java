package com.yyz.data.hive.udf;

import com.google.common.base.Strings;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampNormalize extends UDF {

    private final Text result = new Text();
    private final SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private final SimpleDateFormat outFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");

    public Text evaluate(Text src) {
        if (src == null || Strings.isNullOrEmpty(src.toString())) {
            return null;
        }

        try {
            Date date  = format.parse(src.toString());
            result.set(outFormat.format(date));
        } catch (ParseException err) {
            return src;
        }
        return result;
    }
}
