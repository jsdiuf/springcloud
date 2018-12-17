package com.jsdiuf.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "from server b";
    }

}
