package com.victor.vojcodesandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *Author：Victor_htq
 *Package：com.victor.vojcodesandbox.controller
 *Project：voj-code-sandbox
 *name：MainController
 *Date：2024/1/26  17:06
 *Filename：MainController
 */
@RestController("/")
public class MainController {

    @GetMapping("/health")
    public String healthCheck() {
        return "ok";
    }
}
