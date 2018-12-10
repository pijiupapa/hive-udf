package com.yyz.data.hive.udf;

import org.apache.hadoop.io.Text;

public class Md5Test {
    public static void main(String[] args) {
        Md5 md5 = new Md5();
        Text text = new Text("410702197705251555");
        System.out.println(md5.evaluate(text));
    }
}
