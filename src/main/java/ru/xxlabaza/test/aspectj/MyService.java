package ru.xxlabaza.test.aspectj;

import java.util.concurrent.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

/**
 *
 * @author Artem Labazin
 * <p>
 * @since Jan 14, 2016 | 5:37:17 PM
 * <p>
 * @version 1.0.0
 */
@Service
class MyService {

    private static final Logger LOGGER;

    static {
        LOGGER = LoggerFactory.getLogger(MyService.class);
    }

    @Async
    public Future<Void> doSomeAsync () throws InterruptedException {
        MyPojo myPojo = new MyPojo();
        myPojo.setName("Popa");
        myPojo.setAge(13);

        Thread.sleep(3000L);
        LOGGER.info("Delyed HELLO WORLD!");

        NotBean notBean = new NotBean();
        notBean.doSomeUseful("Hello from not a bean");

        LOGGER.error("Pojo name '{}', age {}", myPojo.getName(), myPojo.getAge());

        return new AsyncResult<>(null);
    }
}
