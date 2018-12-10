package com.yyz.data.hive.udf;

import org.apache.hadoop.io.Text;

public class TimestampNormalizeTest {
    public static void main(String[] args) {
        TimestampNormalize normalize = new TimestampNormalize();
        Text date1 = new Text("2017-6-30 8:35:42");
        System.out.println(normalize.evaluate(date1));
    }
}
