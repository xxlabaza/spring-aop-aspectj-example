package ru.xxlabaza.test.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author Artem Labazin
 * <p>
 * @since Jan 14, 2016 | 5:50:47 PM
 * <p>
 * @version 1.0.0
 */
@Slf4j
@Aspect
@Component
class MyAspect {

    @Before(value = "execution(public " + // method access level
                    "void " + // method return type
                    "ru.xxlabaza.test.aspectj.NotBean.doSomeUseful" + // method name
                    "(java.lang.String)) && args(text)", // method arguments
            argNames = "text")
    public void before (String text) {
        log.info("\n\tBEFORE ->\n\tIncoming argument is {}", text);
    }
}
