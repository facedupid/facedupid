package cn.facedupid.mapper;

import cn.facedupid.entities.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author timothy
 * @data 2021年06月01日 3:19 下午
 * 用户Mapper ，其实不用加 @Repository也可以，加了能避免 引入时报错
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
