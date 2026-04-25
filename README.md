# Spring Boot AWS RDS Integration

## Project Description

This is a Spring Boot application that demonstrates how to integrate with Amazon Web Services (AWS) Relational Database Service (RDS) for data persistence. The application provides a RESTful API for managing products, showcasing the use of Spring Data JPA with an AWS RDS database.

The project includes:
- Product entity with JPA annotations
- ProductRepository for data access
- ProductController with REST endpoints
- Configuration for AWS RDS connectivity

## Features

- CRUD operations for products via REST API
- Integration with AWS RDS MySQL/PostgreSQL
- Spring Boot framework for rapid development
- JPA/Hibernate for ORM
- Maven for dependency management

## Prerequisites

- Java 11 or higher
- Maven 3.6+
- AWS account with RDS instance
- Database credentials configured in application.properties

## Setup and Installation

1. Clone the repository:
   ```
   git clone <repository-url>
   cd springboot-aws-rds
   ```

2. Configure AWS RDS in `src/main/resources/application.properties`:
   ```
   spring.datasource.url=jdbc:mysql://<rds-endpoint>:<port>/<database>
   spring.datasource.username=<username>
   spring.datasource.password=<password>
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. Build the project:
   ```
   mvn clean install
   ```

4. Run the application:
   ```
   mvn spring-boot:run
   ```

## API Endpoints

- `GET /products` - Retrieve all products
- `GET /products/{id}` - Retrieve a product by ID
- `POST /products` - Create a new product
- `PUT /products/{id}` - Update an existing product
- `DELETE /products/{id}` - Delete a product

## Technologies Used

- Spring Boot
- Spring Data JPA
- AWS RDS
- Maven
- Java

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.
