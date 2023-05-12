# SPRING BOOT COMMAND LINE APPLICATION TO CREATE A UNIT TEST TEMPLATE CLASS

## Synopsis

The project is a Spring Boot Command Line Application to create a Unit Test Template Class with the option of Jupiter or TestNG.

## Motivation

I wanted to create a Unit Test classes generator.

## Pre Requirements

None

## Notes

The directories are created if they don't exist.
You just need to add the classes wiht its respective packages and run the application.

ECLIPSE CONSOLE:
----------------
```


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.6)

2023-05-11T21:03:38.160-06:00  INFO 20051 --- [           main] r.a.caldera.UnitTestTemplateApplication  : Starting UnitTestTemplateApplication using Java 17.0.7 with PID 20051 (/Users/rac/Documents/GitHub/spring-boot-unit-test-template-creator/target/classes started by rac in /Users/rac/Documents/GitHub/spring-boot-unit-test-template-creator)
2023-05-11T21:03:38.162-06:00  INFO 20051 --- [           main] r.a.caldera.UnitTestTemplateApplication  : No active profile set, falling back to 1 default profile: "default"
2023-05-11T21:03:38.515-06:00  INFO 20051 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-05-11T21:03:38.519-06:00  INFO 20051 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-05-11T21:03:38.519-06:00  INFO 20051 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.8]
2023-05-11T21:03:38.559-06:00  INFO 20051 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-05-11T21:03:38.560-06:00  INFO 20051 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 376 ms
2023-05-11T21:03:38.705-06:00  INFO 20051 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-05-11T21:03:38.710-06:00  INFO 20051 --- [           main] r.a.caldera.UnitTestTemplateApplication  : Started UnitTestTemplateApplication in 0.694 seconds (process running for 0.82)
2023-05-11T21:03:38.711-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  classPath: rafael/alcocer/caldera/controller
2023-05-11T21:03:38.712-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  sourceFile: src/test/java/rafael/alcocer/caldera/controller/AnyControllerTest.java
2023-05-11T21:03:38.712-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isDirectoryCreated? true
2023-05-11T21:03:38.712-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isFileCreated? true
2023-05-11T21:03:38.712-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### Source Code Generated: 
package rafael.alcocer.caldera.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnyControllerTest { 

    @Mock
    private rafael.alcocer.caldera.service.AnyService anyService;

    @InjectMocks
    private AnyController anyController;

    @Test
    public void showAnything() {
    }

}
2023-05-11T21:03:38.713-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  classPath: rafael/alcocer/caldera/data
2023-05-11T21:03:38.713-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  sourceFile: src/test/java/rafael/alcocer/caldera/data/AnyDataTest.java
2023-05-11T21:03:38.713-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isDirectoryCreated? true
2023-05-11T21:03:38.713-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isFileCreated? true
2023-05-11T21:03:38.713-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### Source Code Generated: 
package rafael.alcocer.caldera.data;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnyDataTest { 

    @InjectMocks
    private AnyData anyData;

    @Test
    public void showAnything() {
    }

}
2023-05-11T21:03:38.713-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  classPath: rafael/alcocer/caldera/model
2023-05-11T21:03:38.713-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  sourceFile: src/test/java/rafael/alcocer/caldera/model/AnyTest.java
2023-05-11T21:03:38.713-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isDirectoryCreated? true
2023-05-11T21:03:38.713-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isFileCreated? true
2023-05-11T21:03:38.713-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### Source Code Generated: 
package rafael.alcocer.caldera.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnyTest { 

    @Mock
    private int id;

    @Mock
    private java.lang.String name;

    @Mock
    private java.lang.String description;

    @InjectMocks
    private Any any;

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getId() {
    }

    @Test
    public void setDescription() {
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void setId() {
    }

}
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  classPath: rafael/alcocer/caldera/model
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  sourceFile: src/test/java/rafael/alcocer/caldera/model/PersonTest.java
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isDirectoryCreated? false
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isFileCreated? true
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### Source Code Generated: 
package rafael.alcocer.caldera.model;

import org.testng.annotations.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonTest { 

    @Mock
    private java.lang.String name;

    @Mock
    private int age;

    @InjectMocks
    private Person person;

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void results() {
    }

    @Test
    public void createAddress() {
    }

    @Test
    public void myName() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }

}
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  classPath: rafael/alcocer/caldera/service
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  sourceFile: src/test/java/rafael/alcocer/caldera/service/AnyServiceTest.java
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isDirectoryCreated? true
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isFileCreated? true
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### Source Code Generated: 
package rafael.alcocer.caldera.service;

import org.testng.annotations.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnyServiceTest { 

    @InjectMocks
    private AnyService anyService;

    @Test
    public void showAnything() {
    }

}
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  classPath: rafael/alcocer/caldera/service
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : #####  sourceFile: src/test/java/rafael/alcocer/caldera/service/AnyServiceImplTest.java
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isDirectoryCreated? false
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### isFileCreated? true
2023-05-11T21:03:38.714-06:00  INFO 20051 --- [           main] r.a.c.u.UnitTestTemplateCreatorUtils     : ##### Source Code Generated: 
package rafael.alcocer.caldera.service;

import org.testng.annotations.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AnyServiceImplTest { 

    @Mock
    private rafael.alcocer.caldera.data.AnyData anyData;

    @InjectMocks
    private AnyServiceImpl anyServiceImpl;

    @Test
    public void showAnything() {
    }

}
2023-05-11T21:03:38.721-06:00  INFO 20051 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]


```


## License

All work is under Apache 2.0 license