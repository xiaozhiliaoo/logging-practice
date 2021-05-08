package org.lili.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lili
 * @date 2021/5/8 2:27
 */
public class HelloWorld1 {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("org.lili.logback.HelloWorld1");
        logger.debug("Hello world.");

    }
}
