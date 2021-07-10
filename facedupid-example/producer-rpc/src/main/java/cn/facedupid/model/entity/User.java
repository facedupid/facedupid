package cn.facedupid.model.entity;

import cn.facedupid.enums.Gender;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author timothy
 * @data 2021年06月01日 3:07 下午
 */
@Data
@TableName("user")
public class User implements Serializable {

    private Long id;
    private String username;
    private Integer age;
    private Gender gender;
    private String email;
}
