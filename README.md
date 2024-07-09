# Users CRUD 
## Description
REST API enabling connection with server by provided endpoints.

## Features
| Method HTTP  | ADRESS | DESCRIPTION |
| ------------- | ------------- |------------- |
| GET  | /books  | returns list of all books  |
| POST  | /books  | creates new book (based on data provided in BODY - JSON)  |
| GET  | /books/{id}  | returns book with id = {id} or throw Exception  |
| PUT  | /books  | changes information of book with id = {id} (based on data provided in BODY - JSON) |
| DELETE  | /books/{id} | deletes book with id = {id}  |


## Technologies
- Java EE
- Spring Boot
- Spring MVC
- Postman
- Mock (instead of connection with database)


## Install
- Fork repo -> clone project -> create new project from existing source
