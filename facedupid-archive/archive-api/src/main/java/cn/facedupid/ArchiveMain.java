package cn.facedupid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <描述>
 *
 * @author timothy.yang cloudwise
 * @since 2021-07-08 15:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ArchiveMain {
    public static void main(String[] args) {
        SpringApplication.run(ArchiveMain.class);
    }
}
