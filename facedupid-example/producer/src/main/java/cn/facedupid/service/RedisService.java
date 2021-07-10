package cn.facedupid.service;

/**
 * @author timothy
 * @data 2021年06月04日 10:18 上午
 * Redis 操作 Service
 * 对象和数组都以 json 形式进行存储
 */
public interface RedisService {

    /**
     * 设置数据
     */
    void set(String key, String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置过期时间
     *
     * @param expire 过期时间
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     *
     * @param delta 自增步长
     */
    Long increment(String key, long delta);

    boolean publish(String channel, String message);
}
