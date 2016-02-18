Spring Embedded Database
===============================
Template for a Spring 4 MVC + Embedded Database examples, using HSQLDB, H2 and Derby.  
[Spring Embedded Database  examples](http://www.mkyong.com/spring/spring-embedded-database-examples/)
##### 1. Technologies used
* Maven 3.0
* Spring 4.1.6.RELEASE
* HSQLDB 2.3.2
* H2 1.4.187
* Derby 10.11.1.1

##### 2. To Run this project locally  
```shell
$ git clone https://github.com/bjb365/spring-embedded-database 
$ # Forked from https://github.com/mkyong/spring-embedded-database 
$ mvn jetty:run
```
Access ```http://localhost:9090/spring-mvc-db/```



NOTES
=======================

##### Startup/Bootstrapping
1. `com.mkyong.servlet3.MyWebInitializer` is loaded. It extends Spring's `AbstractAnnotationConfigDispatcherServletInitializer`
2. `com.mkyong.config.SpringRootConfig` and `com.mkyong.config.SpringWebConfig` are loaded ( from step 1 )



##### Spring Profiles:
`com.mkyong.servlet3.MyWebInitializer` `onStartup(ServletContext servletContext)`
- Sets "spring.profiles.active" property to "hsql"
- Spring Beans annotated with `@Profile("hsql")` are used. Any other `@Bean`s with `@Profile` are ignored.
- In this app it tells Spring to ignore the Derby and H2 config `@Bean`s in `com.mkyong.config.db`

#### Web Config / web.xml:
`com.mkyong.config.SpringWebConfig`
- Java based configuration for web.xml
- Defines InternalResourceViewResolver ( for serving .jsp ) and resource handlers 


