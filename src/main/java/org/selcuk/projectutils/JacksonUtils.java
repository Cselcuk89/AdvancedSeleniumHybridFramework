package org.selcuk.projectutils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JacksonUtils {
    public static <T> T deSerializationJSON(String fileName, Class<T> T) throws IOException {
        /* myBillingAddress.json --> has to be present under src/test/resources */
        InputStream is = JacksonUtils.class.getClassLoader().getResourceAsStream(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(is, T);
    }
}
