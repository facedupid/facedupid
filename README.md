# Facedupid

该项目是一款类似与facebook的在线聊天软件,取名灵感来源于：`facebook + stupid`

## 技术栈
- 注册中心：spring cloud alibaba nacos
- 配置中心：spring cloud alibaba nacos
- RPC：spring cloud alibaba dubbo
- 网关：spring cloud gateway
- 数据库：MySQL
- ORM：Mybatis-Plus

## 模块说明
- facedupid-common：工具模块
- facedupid-example：样例模块
  - consumer：RPC消费者样例
  - producer:RPC生产者样例
  - producer-rpc:RPC生产者样例接口
- facedupid-auth：认证模块
  - auth-api：web服务
  - auth-rpc：对外rpc接口
- facedupid-getaway：网关模块
- facedupid-archive：稿件模块
  - archive-api：web服务
  - archive-rpc：对外rpc接口