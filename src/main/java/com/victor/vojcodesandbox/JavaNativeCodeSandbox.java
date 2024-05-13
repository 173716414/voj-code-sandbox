package com.victor.vojcodesandbox;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.dfa.WordTree;
import com.victor.vojcodesandbox.model.ExecuteCodeRequest;
import com.victor.vojcodesandbox.model.ExecuteCodeResponse;
import com.victor.vojcodesandbox.model.ExecuteMessage;
import com.victor.vojcodesandbox.model.JudgeInfo;
import com.victor.vojcodesandbox.utils.ProcessUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * java原生实现，直接复用模板方法
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {
    @Override
    public File saveCodeToFile(String code) {
        File file=  super.saveCodeToFile(code);
        System.out.println("hello");
        return file;
    }

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}



