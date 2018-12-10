package com.yyz.data.hive.udf;

import org.apache.hadoop.io.Text;

public class StringFormatTest {
    public static void main(String[] args) {
        StringFormat stringFormat = new StringFormat();
        String s = "#^@所发生的asdf1()（）33@!%*#$%*%#!$$";
        System.out.println(stringFormat.evaluate(new Text(s)));
    }
}
