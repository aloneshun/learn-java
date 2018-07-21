package com.example.dubbo.service;

import com.example.dubbo.api.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author yao
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello() {
        return "hello world";
    }
}
