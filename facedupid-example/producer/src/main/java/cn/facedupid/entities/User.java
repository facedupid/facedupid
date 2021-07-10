package cn.facedupid.entities;

import cn.facedupid.enums.Gender;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author timothy
 * @data 2021年06月01日 3:07 下午
 */
@Data
@TableName("user")
public class User {

    private Long id;
    private String username;
    private Integer age;
    private Gender gender;
    private String email;
}
