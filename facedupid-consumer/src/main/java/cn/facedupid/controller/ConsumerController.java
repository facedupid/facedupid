package cn.facedupid.controller;

import lombok.extern.slf4j.Slf4j;
import cn.facedupid.entities.producer.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/consumer")
@RefreshScope
public class ConsumerController {

    @Reference
    private DemoService demoService;

    @GetMapping
    public String test(){
        return demoService.test();
    }
}
