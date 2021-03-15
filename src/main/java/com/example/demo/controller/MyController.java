package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/my")
public class MyController {

    @GetMapping(value = "/cs")
    public String insert() {
        log.info("=============cs===============>");
        return "测试";
    }

    @GetMapping(value = "/name")
    public String cs(String name) {
        log.info("=============这里是测试===============>"+name);
        return "这里是测试"+name;
    }
}
