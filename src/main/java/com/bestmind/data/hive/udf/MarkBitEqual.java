package com.bestmind.data.hive.udf;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.BooleanWritable;
import org.apache.hadoop.io.Text;

/**
 * Created by min on 2018-06-21.
 */
public class MarkBitEqual extends UDF {
    private final BooleanWritable result = new BooleanWritable();

    public BooleanWritable evaluate(Text src1, Text src2) {
        if (src1 == src2) {
            result.set(true);
            return result;
        }
        if (src1 == null || src2 == null) {
            result.set(false);
            return result;
        }
        if (src1.getLength() != src2.getLength()) {
            result.set(false);
            return result;
        }
        String s1 = src1.toString();
        String s2 = src2.toString();
        for (int i = 0; i < src1.getLength(); i++) {
            String temp1 = s1.substring(i, i+1);
            String temp2 = s2.substring(i, i+1);
            if (temp1.equals("*") || temp2.equals("*")) {
                continue;
            }
            if (!temp1.equals(temp2)) {
                result.set(false);
                return result;
            }
        }
        result.set(true);
        return result;
    }
}
