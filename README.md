### 配置 Spring Boot Admin Server 端
1.application.properties 文件中配置：server.port=8000 后，各访问地址：

访问内容 | 网址
--- | ---
wallboard | http://localhost:8000/#/wallboard
applications | http://localhost:8000/#/applications
journal | http://localhost:8000/#/journal
about |http://localhost:8000/#/about

2.启动本 Server 端项目后，再启动项目：https://github.com/cag2050/spring_boot_admin_client_demo ，网址：`http://localhost:8000
/#/applications` 会显示 client 应用；


> 参考：http://www.ityouknow.com/springboot/2018/02/11/spring-boot-admin.html