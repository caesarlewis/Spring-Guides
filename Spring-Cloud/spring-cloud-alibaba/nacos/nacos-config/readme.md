1.启动nacos
2.访问localhost:8848/nacos    默认账号密码是：nacos/nacos
3.启动nacos-config application
4.在nacos配置中添加配置信息
5.在dataId 与group中添加配置信息
6.注意，添加的配置需要与你项目中的配置文件是相同的类型
    比如:你项目中是yml文件，那么你不能在properties中添加配置，配置信息无法转化



### Spring Cloud 应用获取数据

#### dataID
在 Nacos Config Starter 中，dataId 的拼接格式如下

${prefix} - ${spring.profiles.active} . ${file-extension}
prefix 默认为 spring.application.name 的值，也可以通过配置项 spring.cloud.nacos.config.prefix来配置。

spring.profiles.active 即为当前环境对应的 profile，详情可以参考 Spring Boot文档

注意，当 activeprofile 为空时，对应的连接符 - 也将不存在，dataId 的拼接格式变成 ${prefix}.${file-extension}

file-extension 为配置内容的数据格式，可以通过配置项 spring.cloud.nacos.config.file-extension来配置。 目前只支持 properties 类型。

#### group
group 默认为 DEFAULT_GROUP，可以通过 spring.cloud.nacos.config.group 配置