package cn.facedupid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProducerMain8100 {
    public static void main(String[] args) {
        SpringApplication.run(ProducerMain8100.class);
    }
}
