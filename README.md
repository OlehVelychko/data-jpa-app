# Data JPA App

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction
Data JPA App is a Java-based application that demonstrates the use of Spring Data JPA for managing relational data in a Spring Boot application. This project aims to provide a simple and clear example of how to use Spring Data JPA to interact with a database.

## Features
- Integration with Spring Boot
- Use of Spring Data JPA for database operations
- Example CRUD operations
- H2 in-memory database for testing
- Clear and concise code structure

## Installation
To install and run this project locally, follow these steps:

1. Clone the repository:
    ```sh
    git clone https://github.com/OlehVelychko/data-jpa-app.git
    cd data-jpa-app
    ```

2. Build the project using Maven:
    ```sh
    ./mvnw clean install
    ```

3. Run the application:
    ```sh
    ./mvnw spring-boot:run
    ```

## Usage
Once the application is running, you can interact with it using the provided REST API endpoints. Here are some examples:

- Create a new entity:
    ```sh
    POST /api/entities
    ```

- Retrieve all entities:
    ```sh
    GET /api/entities
    ```

- Retrieve a single entity by ID:
    ```sh
    GET /api/entities/{id}
    ```

- Update an existing entity:
    ```sh
    PUT /api/entities/{id}
    ```

- Delete an entity:
    ```sh
    DELETE /api/entities/{id}
    ```

## Contributing
Contributions are welcome! If you have any ideas, suggestions, or improvements, feel free to create an issue or submit a pull request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a pull request

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
If you have any questions or need further assistance, feel free to contact me:

- GitHub: [OlehVelychko](https://github.com/OlehVelychko)
- Email: [your-email@example.com](mailto:your-email@example.com)
