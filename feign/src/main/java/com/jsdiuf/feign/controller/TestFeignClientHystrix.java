package com.jsdiuf.feign.controller;

import org.springframework.stereotype.Component;

/**
 * @Author: Jsdiuf
 * @Date: 2018/12/17 14:47
 * @Description:
 */
@Component
public class TestFeignClientHystrix implements TestFeignClient {
    @Override
    public String add() {
        return "熔断";
    }
}
