package cn.facedupid.controller;

import cn.facedupid.service.RedisService;
import cn.facedupid.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author timothy
 * @data 2021年06月07日 6:38 下午
 */
@RestController
@RequestMapping("/redis")
public class RedisDemoController {

    @Autowired
    private RedisService redisService;

    @GetMapping
    public CommonResult setRedisMsg(@RequestParam("key") String key) {
        String s = redisService.get(key);
        return CommonResult.success(s);
    }

    @PostMapping
    public CommonResult setRedisMsg(@RequestBody HashMap<String,String> map) {
        redisService.set("name",map.get("name"));
        return CommonResult.success("");
    }
    /**
     * 发布
     */
    @PostMapping("/publish")
    public CommonResult publishRedisMsg(@RequestBody HashMap<String, String> map) {
        redisService.publish(map.get("channel"), map.get("msg"));
        return CommonResult.success("");
    }
}
