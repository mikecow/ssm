# SSM



### ssm 项目部署要求：

java.version >= 1.8.0 +

tomcat (我用的是8)

idea(我用的是2020.3.2)



### 项目部署步骤：

1. 将项目拖入idea中

2. 在pom.xml中用maven加载jar包

3. 配置tomcat服务器， 默认配置如下

   ![image-20210201224638405.png](https://dorado.host/usr/uploads/2021/02/721742273.png)



### 项目编码风格规范

1. 测试统一写在test中，测试文件的项目结构要与标准文件中一致，例如：如果要写下列包结构中IAccountDao中的测试方法

![image-20210201225233097.png](https://dorado.host/usr/uploads/2021/02/1682667905.png)

则需要的test目录如下：

![image-20210201225321235.png](https://dorado.host/usr/uploads/2021/02/3928857170.png)

2. 当写接口时，首字母需要为I且为大写，例如要写关于Account的数据库接口类时，文件的命名为IAccountDao.java
3. 在sping或者springmvc配置中如果需要添加/修改配置时，id应设置为类名而且首字母小写
4. 本项目的spring配置采取的时注解+xml的方式，其中一些复杂类用的是注解配置(例如mybatis的配置)，一些简单的bean对象(如accountDao等)应该使用注解配置
5. 在springmvc中，返回值应默认为void，其默认目录应该在pages中加上默认的包名配置，例如该方法：

![image-20210201230044626.png](https://dorado.host/usr/uploads/2021/02/3303390918.png)

所对应的jsp页面应该在WEB-INF/pages/account/findAll.jsp中

![image-20210201230110378.png](https://dorado.host/usr/uploads/2021/02/2034354577.png)



### 注意事项：

1. 目前使用的数据库为本地的数据库，配置在resourcr/ApplicationContext.xml中，如需修改请修改如下

![image-20210201230313642.png](https://dorado.host/usr/uploads/2021/02/118280245.png)

2. 相关学习视频链接：https://www.bilibili.com/video/BV1mE411X7yp?p=1