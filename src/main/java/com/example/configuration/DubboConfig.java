package com.example.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:dubbo/dubbo-*.xml"})
public class DubboConfig {
}
