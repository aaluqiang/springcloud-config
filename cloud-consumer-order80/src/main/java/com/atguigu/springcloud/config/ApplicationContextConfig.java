package com.atguigu.springcloud.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
@Bean
@LoadBalanced //Ribbon手写负载均衡的时候需将负载均衡注解掉（因为 uri 所访问的非Eureka注册表中的服务，所以报错）
public RestTemplate getRestTemplate(){
    return  new RestTemplate();
}
//RestOperations getRestTemplate(RestTemplateBuilder builder) {
//    return builder.build();
//}

}
