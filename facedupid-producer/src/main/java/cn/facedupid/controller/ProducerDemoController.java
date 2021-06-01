package cn.facedupid.controller;

import cn.facedupid.entities.User;
import cn.facedupid.service.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerDemoController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private DemoServiceImpl demoService;
    @GetMapping
    public String test() {
        return "生产者， 端口为：" + port;
    }

    @GetMapping("/user")
    public User getUser(){
        return demoService.getUser();
    }
}
