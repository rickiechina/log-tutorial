package com.rickie.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("hello/{str}")
    public String hello(@PathVariable(value = "str", required = false)
                                    String str){
        logger.trace("tracing ...");
        logger.debug("debugging ...");
        logger.info("input: " + str);
        logger.warn("warning ...");
        logger.error("error in hello() method");

        return "Hello, " + str;
    }
}
