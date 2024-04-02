<p align="left">
  <img src="https://img.icons8.com/external-tal-revivo-duo-tal-revivo/100/external-markdown-a-lightweight-markup-language-with-plain-text-formatting-syntax-logo-duo-tal-revivo.png" width="100" />
</p>
<p align="left">
    <h1 align="left">MEDIA RECORDS</h1>
</p>
<p align="left">
    <em>Welcome to Media Records Audiovisuales, A proyect developted in CampusLands</em>
</p>
<p align="left">
		<em>Developed with the software and tools below.</em>
</p>
<p align="left">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="java">
	<img src="https://img.shields.io/badge/Spring-000000.svg?style=flat&logo=Spring&logoColor=white" alt="Spring">
</p>
<hr>

registrarse antes de consultar, solo sirve get all, delete, y save

## 🔗 Quick Links

> - [📍 Overview](#-overview)
> - [📦 Features](#-features)
> - [📂 Repository Structure](#-repository-structure)
> - [🔏 Authentication and Security](#-authentication-and-security)
> - [🧪 Tests](#-tests)
> - [🤝 Contributing](#-contributing)
> - [👏 Acknowledgments](#-acknowledgments)

---

## 📍 Overview
Aims to build a REST API in Java for an application that allows you to manage a control and rating system of audiovisual content consumed by a user. This system must be supported by a database through which the information entered is managed, and multiple services that allow the creation, consultation, modification and deletion of records.

---

## 📦 Features

## PostgreSQL Connection Configuration
- **Database URL:** jdbc:postgresql://localhost:5432/audiovisuales
- **Database Username:** postgres
- **Database Password:** 1097491909
- **Database Driver:** org.postgresql.Driver

## Hibernate Specific Configuration
- **Hibernate Auto DDL:** update
- **Show Hibernate SQL:** true
- **Hibernate Dialect:** org.hibernate.dialect.MySQL8Dialect
- **Hibernate SQL Logging Level:** debug

## SpringDoc Configuration with Swagger
- **Enable API Documentation Generation:** true
- **Enable Swagger UI:** true
- **Path to access Swagger UI:** /doc/swagger-ui.html
- **Packages to Scan for SpringDoc Classes:** com.apiAudiovisual.web.controller


---

## Database
![img](drawSQL-image-export-2024-04-01(1).png)


## 🔏 Authentication and Security

Authentication for MediaRecords API is done using JSON Web Tokens (JWT). Upon successful login, the user receives a JWT token which must be included in the headers of subsequent requests to access protected endpoints.

## 🔗 Endpoints
    
   - ### Register (Admin Controller)
        ```
            /api/register
        ```

       

   - ### Conten Type

        ```
            /api/contentype
        ```
        
   - ### Genre
     
        ```
            /api/genre
        ```
- ### Platform
     
        ```
            /api/platform 
        ```

- ### Media Record
     
        ```
            /api/mediarecord
        ```
  - ### User Person
     
        ```
            /api/userperson
        ```
    - ### User Record
     
        ```
            /api/userecord
        ```

            

## 📂 Repository Structure

```
```

---

## 🚀 Getting Started

***Requirements***

Ensure you have the following dependencies installed on your system:

* **Java**: `version 17`

### ⚙️ Installation

1. Clone the apiAudiovisual repository:

```sh
git clone https://github.com/violetavillamizara/apiAudiovisual.git
```

3. Install the dependencies:

```sh
mvn clean install
```

### 🧪 Tests

To execute tests, run:

```sh
mvn test
```

---

## Exceptions

Media Records API handles exceptions gracefully, providing meaningful error messages and images in case of failures. Common exceptions include invalid authentication, invalid requests, and database errors.

## Swagger Documentation

Swagger documentation can be accessed at `http://localhost:8080/doc/swagger-ui/index.html`. This interactive documentation provides a user-friendly interface for exploring and testing the API endpoints.

---

## 🤝 Contributing

Contributions are welcome! Here are several ways you can contribute:

---

This concludes the documentation for Media Records API. If you have any further questions or need assistance, please contact me.

- Violeta Villamizar Acuña

---

## 👏 Acknowledgments

- List any resources, contributors, inspiration, etc. here.

    [**Juan Enginner**](#-quick-links)

---
