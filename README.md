# GigaByte

We are a food startup and we need a web application to run our business. Our specialty is the sale of snacks, so some snacks are menu choices and others may contain custom ingredients.


Contents
--------

The mapping of the URI path space is presented in the following table:


URI path                            | HTTP methods   | Notes
----------------------------------- | -------------- | ------------------------------------------------------------------------------
/gigaByte/api/allIngredients        | GET            | webapp/request.html
/gigaByte/api/request               | GET            | webapp/request.html
/gigaByte/api/snackPrice/{id}       | GET            | webapp/request.html
/gigaByte/api/allSnacks             | GET            | webapp/request.html

Installing and Running
-------------------

Build and deploy the project by executing the following command from the
project directory

>   mvn clean package jetty:run

Go to the URL:

<http://localhost:8080/bookstore-webapp/>

#### Test Client Running

>   mvn test -Prun-external-tests


## Built With

* [Angular](https://angular.io/) - JavaScript Framework
* [Maven](https://maven.apache.org/) - Dependency Management
* [Jersey](https://jersey.github.io/) - RESTful Web services
* [JUnit](http://junit.org/junit4/) - Tests Framework 
* [Maven](http://hibernate.org/) - Persistence Framework
