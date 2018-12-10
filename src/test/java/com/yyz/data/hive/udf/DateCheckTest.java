package com.yyz.data.hive.udf;

import org.apache.hadoop.io.Text;

public class DateCheckTest {
    public static void main(String[] args) {
        DateCheck check = new DateCheck();
        Text text = new Text("2018-1-1 00:00:00.22");
        System.out.println(check.evaluate(text));
    }
}
