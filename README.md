# Read Me First
The following was discovered as part of building this project:

* The JVM level was changed from '11' to '17', review the [JDK Version Range](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Versions#jdk-version-range) on the wiki for more details.

# Getting Started

## Basic info on Drools:
Drools is a Business Rules Management System (BRMS) solution. It provides a core Business Rules Engine (BRE), a web authoring and rules management application (Drools Workbench).

It provides a rule engine which processes facts and produces output as a result of rules and facts processing. Centralization of business logic makes it possible to introduce changes fast and cheap.

It also bridges the gap between the Business and Technical teams by providing a facility for writing the rules in a format which is easy to understand.

The KIE project supports the integration of the drools with other technologies like the spring boot framework.

### Maven dependencies added to pom

    <drools-version>7.73.0.Final</drools-version>
		<dependency>
			<groupId>org.drools</groupId>
			<artifactId>drools-core</artifactId>
			<version>${drools-version}</version>
		</dependency>
		<dependency>
			<groupId>org.drools</groupId>
			<artifactId>drools-compiler</artifactId>
			<version>${drools-version}</version>
		</dependency>
		<dependency>
			<groupId>org.drools</groupId>
			<artifactId>drools-decisiontables</artifactId>
			<version>${drools-version}</version>
		</dependency>
		<dependency>
			<groupId>org.drools</groupId>
			<artifactId>drools-mvel</artifactId>
			<version>${drools-version}</version>
		</dependency> 
#
### Run in IntelliJ (java-17) and test using the following curl :
    curl --location --request POST 'localhost:8080/get-discount' \
    --header 'Content-Type: application/json' \
    --data-raw '{
    "customerNumber":"sdfsdf1243",
    "age":15,
    "amount":25000,
    "customerType":"NEW",
    "isPrime":true,
    "cardType":"PLATINUM"
    }'
* Note: Results of the call are based on decision table at src/main/resources/rules/Discount.xls
### Reference Documentation
For further reference, please consider the following sections:

* [Drools Rule engine](https://www.drools.org/)
* [Drools integration](https://www.baeldung.com/drools)
* [Reference to configuration used in this project](https://medium.com/javarevisited/spring-boot-drools-rule-engine-example-965eea437ee9#:~:text=Rule%20engines%20can%20be%20used,like%20the%20spring%20boot%20framework)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

