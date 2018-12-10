package com.bestmind.data.hive.udf;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class Md5 extends UDF {
    private final Text result = new Text();

    public Text evaluate(Text src) {
        if (src == null) {
            return null;
        }
        String id_md5 = DigestUtils.md5Hex(src.toString());
        String md5 = DigestUtils.md5Hex(id_md5.toUpperCase() + "PASSWD@098").toUpperCase();
        result.set(md5);
        return result;
    }
}