# 虚拟化集群架构
> 以前做个虚拟化架构设计，几年前的事情了，如今想架构一个spring-cloud 项目，就把这个项目的业务假想成需求

### 模块描述
#### 单个模块
* vm-common 通用类库
* vm-engine-core 虚拟化核心引擎 ，包括虚拟化操作 ，存储操作，网络操作
* vm-tools 虚拟机工具集，负责对虚拟机内部信息收集，通过虚拟串口传给服务器
* vm-desktop-player 单机版虚拟化，包含通用组件和虚拟引擎 （有界面）
* vm-db-migration 数据库迁移工具
* vm-thin-client 客户用来连接虚拟机的瘦客户端 （有界面）
#### 集群模块
* vm-eureka-server-discovery 集群注册发现服务 
* vm-eureka-server-host 单机版虚拟化服务，可以单独使用，也可以成为cluster 机器的一个节点
* vm-eureka-server-gateway 负载均衡网关，防止开机风暴
* vm-eureka-server-cluster 集群操作中心，管理人员使用 （有界面）
* vm-eureka-server-desktop 批量桌面部署服务 （有界面）
* vm-eureka-server-ad   AD 域操作模块
* vm-eureka-server-store 集群数据存储模块
* vm-eureka-server-cache 集群缓存模块
* vm-eureka-server-monitor 集群监控模块 （有界面）
* vm-eureka-server-distri-center 分布式虚拟桌面服务器端 （有界面）
* vm-eureka-server-distri-client 分布式虚拟桌面客户端 （有界面）
* vm-eureka-server-dispatch 考虑开机风暴，分流问题专门做一个转发
> 只是为了架构设计，不实现任何功能

目前 gateway ,cluster,ad ，discovery 简单实现了联调功能
