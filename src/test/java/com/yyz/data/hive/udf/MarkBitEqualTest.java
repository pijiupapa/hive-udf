package com.yyz.data.hive.udf;

import org.apache.hadoop.io.Text;

/**
 * Created by min on 2018-06-21.
 */
public class MarkBitEqualTest {

    public static void main(String[] args) {
        Text s1 = new Text("402211198*0765****");
        Text s2 = new Text("402211198*07651234");
        Text s3 = new Text("402211198*0765134");
        Text s4 = new Text("302211198*0765****");
        MarkBitEqual markBitEqual = new MarkBitEqual();
        System.out.println(markBitEqual.evaluate(s1, s2));
        System.out.println(markBitEqual.evaluate(s1, s3));
        System.out.println(markBitEqual.evaluate(s1, s4));
    }
}
