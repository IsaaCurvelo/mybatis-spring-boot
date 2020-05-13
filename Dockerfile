FROM openjdk:11
ADD target/mybatis-spring-boot.jar mybatis-spring-boot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "mybatis-spring-boot.jar"]