package com.bestmind.data.hive.udf;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import org.apache.commons.codec.digest.DigestUtils;


@Description(name = "md5sha1",
        value = "_FUNC_(string) - Returns a md5 and sha1 hex string.",
        extended = "Example:\n"
                + "  > SELECT _FUNC_(hello);\n"
                + "  '0f869632dedf073cb0587e8dfa43ec94c872abfc'\n")
public class Md5Sha1 extends UDF  {
    private final Text result = new Text();

    public Text evaluate(Text src) {
        if (src == null) {
            return null;
        }
        String md5 = DigestUtils.md5Hex(src.toString());
        String sha =  DigestUtils.sha1Hex(md5);
        result.set(sha);
        return result;
    }
}

