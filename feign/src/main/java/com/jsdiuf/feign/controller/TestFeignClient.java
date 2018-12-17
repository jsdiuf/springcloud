package com.jsdiuf.feign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SERVICE-B")
public interface TestFeignClient {

  @GetMapping("/test")
  public String add();
}
