package ru.xxlabaza.test.aspectj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Artem Labazin
 * <p>
 * @since Jan 14, 2016 | 5:36:27 PM
 * <p>
 * @version 1.0.0
 */
@RestController
class MyController {

    @Autowired
    private MyService myService;

    @RequestMapping
    public String callMeMaybe () throws InterruptedException {
        myService.doSomeAsync();
        return "ok";
    }
}
