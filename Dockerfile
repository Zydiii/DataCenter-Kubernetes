FROM registry.cn-beijing.aliyuncs.com/qcy_docker/openjdk11
ADD target/datacenter-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]