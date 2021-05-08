package org.lili.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lili
 * @date 2021/5/8 10:20
 */
public class HelloWorld {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("Hello World");
    }
}
