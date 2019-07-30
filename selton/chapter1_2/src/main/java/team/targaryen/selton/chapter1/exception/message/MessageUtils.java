package team.targaryen.selton.chapter1.exception.message;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

@Slf4j
public class MessageUtils {

    public static Properties properties;
    private static String country = "zh_cn";

    static {
        String filePath = country + ".properties";
        try {
            InputStreamReader in = new InputStreamReader(MessageUtils.class.getClassLoader().getResourceAsStream(filePath), "UTF-8");
            properties = new Properties();
            properties.load(in);
        } catch (IOException e) {
            log.error("load file error. file path: {} ", filePath);
        }
    }

    private MessageUtils() {
    }

    public static String getMsg(String code) {
        return properties.getProperty(code);
    }

    public static String getMsg(String code, Object[] args) {
        return String.format(getMsg(code), args);
    }
}