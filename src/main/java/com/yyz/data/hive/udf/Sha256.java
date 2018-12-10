package com.yyz.data.hive.udf;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class Sha256 extends UDF {
    private final Text result = new Text();

    public Text evaluate(Text src) {
        if (src == null) {
            return null;
        }
        String sha256 = DigestUtils.sha256Hex(src.toString());
        result.set(sha256);
        return result;
    }
}
