package org.lili.logback;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lili
 * @date 2021/5/8 2:28
 */
public class HelloWorld2 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("org.lili.logback.HelloWorld2");
        logger.debug("Hello world.");

        // print internal state
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
