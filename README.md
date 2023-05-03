# CarManagementSystem

Features of this project-

1.Retrieve all cars
2.Retrieve a single car by ID
3.Create a new car
4.Update an existing car
5.Delete a car

Environment-

->Spring Tool suit IDE
->Java 17
->Spring Boot
->Spring initializr
->H2 Embedded Database
->spring data jpa
->spring security

Operating Instructions-

Download source code and import into your code editor (Spring suit tool).
The project is created with springboot, so you just need to import it to your IDE and build the project to resolve the dependencies
If there are no errors, run program.
Use Postman to check app or use tests.

POST METHOD
/add
{
"id":"1",
"name":"benz",
"price":"20000"
}

GET METHOD
/all
list all cars in db
/findby{id}
list cars by id

PUT METHOD

/update/{id}
update cars with id

DELETE METHOD

/delete/{id}
Delete car with ID.

