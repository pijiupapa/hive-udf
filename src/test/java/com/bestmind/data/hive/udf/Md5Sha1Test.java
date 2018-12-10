package com.bestmind.data.hive.udf;

import org.apache.hadoop.io.Text;

public class Md5Sha1Test {
    public static void main(String[] args) {
        String param = "hello";
        String result = "0f869632dedf073cb0587e8dfa43ec94c872abfc";
        Md5Sha1 item = new Md5Sha1();
        Text src = new Text(param);
        System.out.println("string hello, excepted " +
                result + ", result " + item.evaluate(src));

    }
}
