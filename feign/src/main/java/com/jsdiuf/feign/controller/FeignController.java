package com.jsdiuf.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Jsdiuf
 */
@RestController
public class FeignController {
  @Autowired
  private TestFeignClient testFeignClient;

  @RequestMapping(value = "/add" , method = RequestMethod.GET)
  public String add() {
    String string = this.testFeignClient.add();
    System.out.println(string);
    return string;
  }
}
