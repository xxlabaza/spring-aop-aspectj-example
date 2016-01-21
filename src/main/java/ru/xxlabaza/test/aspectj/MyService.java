package ru.xxlabaza.test.aspectj;

import java.util.concurrent.Future;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
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
@Slf4j
@Service
class MyService {

    @Async
    public Future<Boolean> doSomeAsync () throws InterruptedException {
        val myPojo = new MyPojo();
        myPojo.setName("Popa");
        myPojo.setAge(13);

        Thread.sleep(3000L);
        log.info("Delyed HELLO WORLD!");

        val notBean = new NotBean();
        notBean.doSomeUseful("Hello from not a bean");

        log.error("Pojo name '{}', age {}", myPojo.getName(), myPojo.getAge());

        return new AsyncResult<>(Boolean.TRUE);
    }
}
