package cn.facedupid.controller;

import cn.facedupid.entities.User;
import cn.facedupid.service.RedisService;
import cn.facedupid.service.impl.DemoServiceImpl;
import cn.facedupid.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

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

    /**
     * 与数据库交互
     *
     * @return
     */
    @GetMapping("/user")
    public User getUser() {
        return demoService.getUser();
    }


}
