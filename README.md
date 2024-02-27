configurations for Postgres & Mongo 
#Database configuration Postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/DBName
spring.datasource.username=postgres
spring.datasource.password=password
#DDL Generation ->
spring.jpa.generate-ddl=true

#MongoDB Connections
spring.data.mongodb.uri=mongodb://localhost:27017/
spring.data.mongodb.database=DBName

Dependencies
#Spring web
#Spring Data JPA
#MySQL driver
#Spring data JDBC
#Spring data mongoDB
#Postgres SQL driver

Configurations for MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/divyashreedb
spring.datasource.username=root
spring.datasource.password=Govinda@3210
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
Dependencies
#Spring web
#Spring Data JPA
#MySQL driver
#Spring data JDBC
