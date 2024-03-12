# Postgres Spring JPA Starter

This is a starter project for a Spring Boot application with Postgres and JPA.

APi calls in POSTMAN:
1. Add Property:
   - POST: http://localhost:8080/property
   - Request Body:
   ```
   {
    "name": "clinton_street",
    "address": "106 clinton street",
    "beds": 2
   }
   ```
2. Get Property By Name:
    - GET: http://localhost:8080/property/clinton_street
    - Response:
    ```
    {
        "id": 1,
        "name": "clinton_street",
        "address": "106 clinton street",
        "beds": 2
    }
    ```