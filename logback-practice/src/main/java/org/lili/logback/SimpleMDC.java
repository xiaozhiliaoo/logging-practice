package org.lili.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lili
 * @date 2021/5/8 2:17
 */
public class SimpleMDC {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SimpleMDC.class);
        logger.info("aaa");
    }

}
