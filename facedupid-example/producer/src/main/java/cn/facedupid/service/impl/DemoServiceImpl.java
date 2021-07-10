package cn.facedupid.service.impl;

import cn.facedupid.entities.User;
import cn.facedupid.mapper.UserMapper;
import cn.facedupid.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@org.apache.dubbo.config.annotation.Service
public class DemoServiceImpl implements DemoService {

    @Value("${server.port}")
    private String port;

    @Autowired
    private UserMapper userMapper;

    @Override
    public String test() {
        return "生产者中的方法，端口为：" + port;
    }

    /**
     * 获取用户
     *
     * @return
     */
    public User getUser() {
        List<User> users = userMapper.selectList(null);
        return users.get(0);
    }
}
