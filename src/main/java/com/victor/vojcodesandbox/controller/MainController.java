package com.victor.vojcodesandbox.controller;

import com.victor.vojcodesandbox.JavaCodeSandboxTemplate;
import com.victor.vojcodesandbox.JavaNativeCodeSandbox;
import com.victor.vojcodesandbox.model.ExecuteCodeRequest;
import com.victor.vojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @Resource
    private JavaNativeCodeSandbox javaNativeCodeSandbox;
    @GetMapping("/health")
    public String healthCheck() {
        return "ok";
    }

    @PostMapping("/executeCode")
    ExecuteCodeResponse executeCode(@RequestBody ExecuteCodeRequest executeCodeRequest) {
        if (executeCodeRequest == null) {
            throw new RuntimeException("请求参数为空");
        }
        return javaNativeCodeSandbox.executeCode(executeCodeRequest);
    }
}
