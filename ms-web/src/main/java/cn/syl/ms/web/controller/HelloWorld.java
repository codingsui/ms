package cn.syl.ms.web.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
    Logger logger = Logger.getLogger(HelloWorld. class );

    @RequestMapping("/hello")
    public String hello(){

        logger.info("hello info");
        logger.debug("hello debug");
        logger.warn("hello warn");
        logger.error("hello error");
        return "hello";
    }

    public static void main(String[] args) {
    }
}
