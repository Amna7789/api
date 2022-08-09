package com.Amy.Api.controller.PracticeA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);
    @GetMapping("/testing")
    public String testLogger(){
        logger.debug("Let me debug");
        logger.error("There is no error");
        logger.warn("it's a warning");
        logger.trace("home method accessed");
        return "Hello from Springboot";
    }
}
