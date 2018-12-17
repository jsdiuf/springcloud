package com.jsdiuf.servicea.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: Jsdiuf
 *
 * @Date: 2018/12/17 13:07
 *
 * @Description:
 */
@RestController
public class TestController {
    @GetMapping(value = "/test")
    public String add() {
        System.out.println(123);
        return "from server a";
    }

}
