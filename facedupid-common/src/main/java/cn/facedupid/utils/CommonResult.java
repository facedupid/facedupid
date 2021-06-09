package cn.facedupid.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author timothy
 * @data 2021年06月04日 5:27 下午
 * 通用结果集
 */
@AllArgsConstructor
@Data
public class CommonResult<T> {
    private String code;
    private String message;
    private boolean result;
    private T Data;

    public static CommonResult success(Object data) {
        return new CommonResult("00000", "", true, data);
    }

    public static CommonResult fail(String code, String message) {
        return new CommonResult(code, message, true, "");
    }
}
