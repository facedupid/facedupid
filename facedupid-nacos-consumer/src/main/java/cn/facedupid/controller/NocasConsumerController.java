package cn.facedupid.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping
public class NocasConsumerController {

    @Value("${service-url.nocas-user-service}")
    private String serviceUrl;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/")
    public String test(){
        return restTemplate.getForObject(serviceUrl+"/nacosPayment",String.class);
    }
}