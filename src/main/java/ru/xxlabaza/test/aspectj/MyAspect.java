/* 
 * Copyright 2016 xxlabaza.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
