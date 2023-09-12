# Lab 05 - Use Docker Compose to deploy a Spring Boot application

* Get the example from https://github.com/docker/awesome-compose/tree/master/spring-postgres running on your VM using docker compose
* For an added challenge, update the application with the following modifications...

* Create a new table
```
CREATE TABLE IF NOT EXISTS THINGS (
    id serial PRIMARY KEY,
    name varchar(50) NOT NULL,
    description varchar(255) NOT NULL
);
``` 
* Insert test data into the new table
```
INSERT INTO THINGS(name, description) values ('Thingamabob', 'Just a regular thing');

INSERT INTO THINGS(name, description) values ('Whatchamacallit', 'Actually a candy bar');

INSERT INTO THINGS(name, description) values ('Hoozywhatzit', 'Would take too long to describe');
```
* Add an entity class for the new table
* Add a repository class for the new entity
* Add a new Freemarker template to display the new data as a list (see the existing templates for examples - `/backend/src/main/resources/templates/home.ftlh`)
* Add a new controller endpoint in `HomeController.java` to display the new template with data from the new repository
* Make sure that you run `docker compose build` after any changes to the source code to pick up the changes
* Run `docker compose up` to start the application
* Run `docker compose down -v` to stop the application and remove the volumes (so that subsequent runs will recreate the test data fresh)
* If you want to connect to the PostgreSQL database to view the data:
    - Attach a shell to the running PostgreSQL container
    - Run `su - postgres` to switch to the postgres user (out of root)
    - Run `psql` to connect to the database
    - Run `\c example` to connect to the postgres database
    - Run `\dt` to list the tables
    - Run `select * from things;` to view the data in the new table
* Feel free to explore the other files in the example to gain additional insight into how the application works