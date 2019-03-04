# spring-boot-security-oauth2
This article aims to provide a working example of spring boot security oauth2. To ge started with this project just checkout the project
and set up the database configuration as per application.properties and run Application.java as a java application and you are done.

This project uses
1. Spring Boot 1.5.8.RELEASE
2. Java 8
3. MySql


http://localhost:8080/oauth/token
username: client
password: secret

in body pass
username: Ajit13
password: password
grant_type: password

Insert into DB

INSERT INTO User (id, username, password, salary, age) VALUES (1, 'Ajit123', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 3456, 33);

sample respone:
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTE2NzA2NjgsInVzZXJfbmFtZSI6IkFqaXQxMjMiLCJhdXRob3JpdGllcyI6WyJST0xFX0FETUlOIl0sImp0aSI6ImNjODBjMDIyLTAyOWUtNGQ4Yi1iZmUxLWRjNGQ1YjZiNWNjYyIsImNsaWVudF9pZCI6ImNsaWVudCIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSIsInRydXN0Il19.DgJV_QjIw26DYgGvG-akzy8gdKiH30b-ocI0Lr01nuo",
    "token_type": "bearer",
    "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJBaml0MTIzIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIiwidHJ1c3QiXSwiYXRpIjoiY2M4MGMwMjItMDI5ZS00ZDhiLWJmZTEtZGM0ZDViNmI1Y2NjIiwiZXhwIjoxNTUxNjg4NjY4LCJhdXRob3JpdGllcyI6WyJST0xFX0FETUlOIl0sImp0aSI6Ijk0MjI0N2U4LTBjMDktNGUyMS05NjNhLWNkMGY0MzZiZjM1YiIsImNsaWVudF9pZCI6ImNsaWVudCJ9.fmmEwvCfC-Z5kbyhhsr8ZOBqoxqKt8Rc2IpH9gfclPQ",
    "expires_in": 3599,
    "scope": "read write trust",
    "jti": "cc80c022-029e-4d8b-bfe1-dc4d5b6b5ccc"
}

use the access token to get the response from actual url:

http://localhost:8080/oauth/token


http://localhost:8080/users/user?access_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NTE2NzA2NjgsInVzZXJfbmFtZSI6IkFqaXQxMjMiLCJhdXRob3JpdGllcyI6WyJST0xFX0FETUlOIl0sImp0aSI6ImNjODBjMDIyLTAyOWUtNGQ4Yi1iZmUxLWRjNGQ1YjZiNWNjYyIsImNsaWVudF9pZCI6ImNsaWVudCIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSIsInRydXN0Il19.DgJV_QjIw26DYgGvG-akzy8gdKiH30b-ocI0Lr01nuo



