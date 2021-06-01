package cn.facedupid.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author timothy
 * @data 2021年06月01日 4:14 下午
 */
public enum Gender {
    UNKNOW(0, "未知"),
    GIRL(1, "女孩"),
    BOY(2, "男孩");

    Gender(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @EnumValue
    private final int code;
    private final String desc;
}