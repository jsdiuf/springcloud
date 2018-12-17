package com.jsdiuf.feign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jsdiuf
 */
@FeignClient(name = "SERVICE-B",fallback = TestFeignClientHystrix.class)
public interface TestFeignClient {

  @GetMapping("/test")
  public String add();
}
