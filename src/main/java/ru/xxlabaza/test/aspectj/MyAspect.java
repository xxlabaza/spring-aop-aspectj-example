package ru.xxlabaza.test.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Artem Labazin
 * <p>
 * @since Jan 14, 2016 | 5:50:47 PM
 * <p>
 * @version 1.0.0
 */
@Aspect
@Component
class MyAspect {

    private static final Logger LOGGER;

    static {
        LOGGER = LoggerFactory.getLogger(MyAspect.class);
    }

    @Before(value = "execution(public " + // method access level
                    "void " + // method return type
                    "ru.xxlabaza.test.aspectj.NotBean.doSomeUseful" + // method name
                    "(java.lang.String)) && args(text)", // method arguments
            argNames = "text")
    public void before (String text) {
        LOGGER.info("\n\tBEFORE ->\n\tIncoming argument is {}", text);
    }
}
