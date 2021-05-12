package cn.facedupid.service;

import cn.facedupid.entities.producer.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class DemoServiceImpl implements DemoService {

    @Value("${server.port}")
    private String port;

    @Override
    public String test() {
        return port;
    }
}
