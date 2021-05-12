package cn.facedupid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayMain8999 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain8999.class);
    }
}
