# Docker部署

## 部署SpringBoot应用

### 编写Dockerfile 

Dockerfile 模板
```Dockerfile
# Docker image for springboot file run
# VERSION 0.0.1
# Author: nanchaos
# 基础镜像使用java
FROM java:8
# 作者
MAINTAINER nanchaos <nanchaos@163.com>
# VOLUME 指定了临时文件目录。
VOLUME /nanchaos/temp/Docker
# 暴露端口
EXPOSE 18081
# 将jar包添加到容器中并更名为app.jar
ADD web-0.0.1.jar fastdfs-server.jar
# 运行jar包
ENTRYPOINT ["java","-jar","/nanchaos-start.jar"]
```

### 打包镜像

```shell
docker build -t imageName:version .
docker build -t fastdfs-provider:0.0.1 .
docker build -t fastdfs-consumer:0.0.1 .
docker build -t fastdfs-server:0.0.1 .

docker build -t nanchaos-file-system-server:1.0.1 .
```

### 部署

```shell
docker run -itd --restart always --name ContainerName -p 80:80 -v /nanchaos/docker/containter:/data
```

## 关于自动化部署

大致分为以下几步
```text
# 每个应用存放的代码目录都是一致的，部署的目录也是一致的
0. 发版hook，更新本地代码

1. 获取发版分支的commit版本号
git rev-parse main

2. mvn获取当前的版本号
VERSION=$(mvn help:evaluate -Dexpression=project.version -q -DforceStdout)
echo "Project version is: $VERSION"

可以根据当前获取的版本号，进行校验，与当前部署的版本号进行比较

3. 打包
版本号第三步已经拿到了，应用名也是固定的

4. 部署 
```