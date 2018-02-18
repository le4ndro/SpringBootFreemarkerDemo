# SpringBootFreemarkerDemo
Sample using Spring Boot + Freemarker + Bootstrap.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software

* Java JDK 8
* Apache Maven
* MySQL Database

### Installing

1. Clone this repository

```
$ git clone https://github.com/le4ndro/SpringBootFreemarkerDemo.git
$ cd SpringBootFreemarkerDemo
```

2. Create database

```
mysql> CREATE DATABASE testespringbootfreemarker;
```

3. Run the application

```
$ mvn spring-boot:run
```
## Deployment

1. Create an executable jar

```
$ mvn package
```

2. Run the application

```
$ java -jar target/SpringBootFreemarkerDemo-0.0.1-SNAPSHOT.jar
```

## Built With

* [Spring Boot](https://docs.spring.io/spring-boot/docs/1.3.1.RELEASE/reference/htmlsingle/) - The web framework used
* [Freemarker](https://freemarker.apache.org/) - Template engine
* [Bootstrap](http://getbootstrap.com/docs/3.3/) - Html framework
* [WebJars](https://www.webjars.org/) - Client side packages
* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags).

## Authors

* **Leandro Souza** - *Initial work*

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* This project is for learning purposes
