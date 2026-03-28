# Heroku Docker Spring Boot with Maven
## [使用 Spring Boot 開發 Backend Bot Server: Maven 管理專案與依賴的實踐筆記](https://ithelp.ithome.com.tw/m/articles/10364942)
```
mvn spring-boot:run
```

## [從無到有上手你的第一個 Spring Boot 應用程式](https://blog.miniasp.com/post/2022/09/19/Spring-Boot-Quick-Start-From-Scratch)

## [Spring Boot with Docker](https://spring.io/guides/gs/spring-boot-docker)
```
./mvnw package && java -jar target/demo-0.0.1-SNAPSHOT.jar
```
### Build Docker image
```
docker build -t heroku-docker-spring-boot-maven-app .
```
### Run Docker container
```
docker run -d -p 9000:9000 heroku-docker-spring-boot-maven-app
```