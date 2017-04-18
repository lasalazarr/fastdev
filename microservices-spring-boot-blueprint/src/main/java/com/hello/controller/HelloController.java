package com.hello.controller;

import com.hello.entity.Test;
import com.hello.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hello.vo.HelloVo;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 4/12/17.
 */
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Inject
    protected HelloService helloService;

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @RequestMapping("/data")
    public List<HelloVo> data() {
        List<HelloVo> helloVoList = new ArrayList<>();

        logger.info("HELLO LOGGER!");
        logger.error("ERROR TEST LOGGER!");
        logger.debug("DEBUG TEST LOGGER!");
        HelloVo helloVo = new HelloVo();
        helloVo.setName("Test");
        helloVo.setLastName("Last Test");
        helloVoList.add(helloVo);
        return helloVoList;
    }

    @RequestMapping("/test")
    public List<Test> obtainTest() {
        List<Test> helloVoTest =helloService.getAll();
        return helloVoTest;
    }

    @RequestMapping("/param/{param}")
    public String param(@PathVariable("param") String param) {
        return "You passed the next parameter" +param;
    }

}
