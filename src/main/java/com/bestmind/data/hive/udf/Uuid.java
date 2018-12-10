package com.bestmind.data.hive.udf;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import java.util.UUID;



@Description(name = "uuid",
        value = "_FUNC_() - Returns a universally unique identifier (UUID) string.",
        extended = "The value is returned as a canonical UUID 36-character string.\n"
                + "Example:\n"
                + "  > SELECT _FUNC_();\n"
                + "  '0baf1f5253df487f829299a03716b688'\n")
public class Uuid extends UDF {
    private final Text result = new Text();
    /**
     * Returns a universally unique identifier (UUID) string (36 characters).
     *
     * @return Text
     */
    public Text evaluate() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        result.set(uuid);
        return result;
    }
}