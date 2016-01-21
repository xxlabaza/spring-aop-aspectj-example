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

import lombok.Data;

/**
 *
 * @author Artem Labazin
 * <p>
 * @since Jan 15, 2016 | 5:24:56 PM
 * <p>
 * @version 1.0.0
 */
@Data
class MyPojo {

    private String name;

    private int age;
}
