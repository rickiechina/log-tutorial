# Spring Boot v2.2.1项目使用SLF4J、Log4j2记录日志

SLF4J（Simple Logging Facade For Java）是一个针对于各类Java日志框架的统一Facade抽象。

Java日志框架众多--常用的有java.util.logging、log4j2、logback、commons-logging。

SLF4J定义了统一的日志抽象接口，而真正的日志实现则是在运行时决定的，它提供了各类日志框架的binding。

日志工具使用的最佳实践就是在应用中使用如Log4j2 + SLF4J 这样的组合来进行日志输出，Log4j2有比较好的性能。

# Spring Boot v2.2.1项目使用SLF4J、Logback 记录日志

Logback是log4j框架的作者开发的新一代日志框架，能够适应诸多的运行环境，同时天然支持SLF4J。



# 本技术专栏链接

<https://learning.snssdk.com/feoffline/toutiao_wallet_bundles/toutiao_learning_wap/online/album_detail.html?content_id=6752726260226457863>

![](https://raw.githubusercontent.com/rickiechina/SpringCloudAlibaba-In-Practice/master/images/SpringCloud-logo-2.jpg)

### 适合人员

适合有一定Java开发基础的开发人员；



### 通过本专栏学习，您将收获

了解微服务架构的发展过程和基本原理；
了解 Spring Cloud 各核心组件的运行原理；
掌握 Spring Cloud 各核心组件的使用；
掌握 Spring Cloud Alibaba核心套件的使用；
掌握使用 Spring Cloud 搭建微服务架构及监控其运行状态；
微服务架构项目落地的具体解决方案；



作者在一线互联网公司工作多年，熟悉高并发和海量数据处理，具有丰富的系统架构实战经验。