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
### Build and run container with `docker-compose.yml`
```
docker compose up --build
```

## [站在 Docker 的肩膀上，部署任何語言的 Web 應用到 Heroku](https://medium.com/starbugs/deploy-any-web-application-to-heroku-with-docker-b64b9b0eb93)

Build docker image
```
docker build -t heroku-docker-spring-boot-maven-app .
```

在 Heroku 上新增一個 app
```
heroku create docker-spring-boot-maven-app
heroku git:remote --app docker-spring-boo-maven-app
```

部署到 Heroku
```
heroku container:login
heroku stack:set container
heroku container:push web
heroku container:release web
```
```
heroku open
```