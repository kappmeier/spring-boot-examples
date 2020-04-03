/*
 * Copyright 2016 Jan-Philipp Kappmeier
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
package de.nerdpause.demo.multistaterequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * A simple Spring Boot demo application showing how multiple values can be returned upon a single
 * http POST request. It allows to start a request which takes a longer period of time and runs in
 * an own thread. The request runs in two steps and in parallel the requesting web page can request
 * status updates. The updates are served using long polling.
 * 
 * @author Jan-Philipp Kappmeier
 */
@SpringBootApplication
@EnableAsync
public class MultiStateRequestDemo {

    /**
     * Starts the demo application using the Spring Boot starter.
     *
     * @param args the command line arguments
     * @throws Exception if starting the application fails
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MultiStateRequestDemo.class, args);
    }
}
