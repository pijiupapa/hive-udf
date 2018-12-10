package com.bestmind.data.hive.udf;

import org.apache.hadoop.io.Text;

public class DateFormatTest {
    public static void main(String[] args) {
        DateFormat formatTest = new DateFormat();
        Text text = new Text("2018-1-1 00:00:00.22");
        System.out.println(formatTest.evaluate(text));
    }
}
