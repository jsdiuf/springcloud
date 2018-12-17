package com.jsdiuf.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author Jsdiuf
 */
@RestController
public class FeignController {

    @Autowired
    private TestFeignClient testFeignClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        String string = this.testFeignClient.add();
        System.out.println(string);
        //System.out.println(this.restTemplate.getForObject("http://service-a/test", String.class));
        return string;
    }
}
