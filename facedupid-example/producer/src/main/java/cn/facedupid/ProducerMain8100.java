package cn.facedupid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.facedupid.mapper") // 该注解 自动扫描mapper包
public class ProducerMain8100 {
    public static void main(String[] args) {
        SpringApplication.run(ProducerMain8100.class);
    }
}
