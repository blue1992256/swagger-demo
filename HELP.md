# Swagger 적용해보기

## 프로젝트 정보

### 프로젝트 개발 환경

* 스프링부트 2.7.10
* springfox-boot-starter 3.0.0
* springfox-swagger-ui 3.0.0


### 주의점

스프링부트 2.6.0 부터는 properties 에서 spring.mvc.pathmatch.matching-strategy 를 ant_path_matcher 로 설정해야한다.

* application.properties
````
spring.mvc.pathmatch.matching-strategy=ant_path_matcher
````
