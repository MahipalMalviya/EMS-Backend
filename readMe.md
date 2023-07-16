# This is for my understanding process.
1. Add MySQL url, username, password in application.properties file.
2. Add JPA hibernate Dialect for MySQL in application.properties file.
3. Add Entity/Table with Lombok annotations.
4. Add repository interface which extend JPA repository.
5. Add dto class.
6. Add Mapper Class which converts DTO Class to Entity JPA and Entity JPA to DTO class.
7. create service interface and serviceImpl class and class implement interface.
8. In service interface, add api methods and override that methods in ServiceImpl class.
9. Add RestController Class with its API methods(ex. POST, GET, PUT, DELETE) with RequestMapping and RestController Annotations.
10. Open Postman and add POST method and JSON body employee data and hit send button.
11. Check Data reflected or not in MYSql.
12. Do CRUD operation.
