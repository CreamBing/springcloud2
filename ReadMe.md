#系统架构
***
- 目前以springboot2.0.0.RELEASE为框架基础,搭建springcloud2.0微服务框架体系
采用spring-cloud-consul2.0作为服务发现和配置中心,至于不使用zookeeper作为配置
中心主要是因为springcloud-zookeeper是cp类型,不保证可用性,且其他功能如健康检查
都没有consul强大,另外consul是ca类型,然而不选择Eureka是因为它2.0闭源了,所以该系
统采用consul.另外系统集成springboot-data中其他模块,方便其他模块集成
***

##datasource模块
***
- datasource模块集成了springboot-data中的相关模块,主要是一些后台数据存储的中间
件的客户端初始化
###redis模块
- 利用spring-boot-starter-data-redis集成redis



