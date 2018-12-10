package com.yyz.data.hive.udf;

import com.google.common.base.Strings;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;


public class StringFormat extends UDF {
    private final Text result = new Text();
    public Text evaluate(Text src) {
        if (src == null || Strings.isNullOrEmpty(src.toString())) {
            return null;
        }
        String s = src.toString();
        s = s.replaceAll("#|\\$|%|\\^|&|\\*|@|!|\\d|\\w|\\(.*\\)|（.*）", "");
        result.set(s);
        return result;
    }
}
