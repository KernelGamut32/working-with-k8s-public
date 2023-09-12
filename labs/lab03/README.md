# Lab 03 - Containerize a Database Server

https://www.baeldung.com/docker-cant-connect-local-mysql

* Run `docker pull mysql:latest` to pull the latest MySQL image from Docker Hub
* Create a new folder on the host at `~/storage/docker` to store the MySQL data
* Run `docker run --name mysql -e MYSQL_ROOT_PASSWORD=password -v ~/storage/docker:/var/lib/mysql -d mysql:latest` to start a MySQL container
* Install the MySQL client on the host using `sudo apt install mysql-client -y`
* Run `mysql -uroot -p -h127.0.0.1` to attempt to connect to the MySQL server from the host - this will fail
* Run `docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' mysql` to get the IP address of the MySQL container
* Run `mysql -uroot -p -h<IP address of MySQL container> --protocol=tcp` to attempt to connect to the MySQL server from the host - this will succeed
* Run `create database stuff;`
* Run `use stuff;`
* Run `create table things (Id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(25) NOT NULL, Description VARCHAR(50) NOT NULL);`
* Run `insert into things (Name, Description) values ('Thing 1', 'This is the first thing');`
* Run `insert into things (Name, Description) values ('Thing 2', 'This is the second thing');`
* Run `insert into things (Name, Description) values ('Thing 3', 'This is the third thing');`
* Remove the currently running container using `docker rm -f mysql`
* Recreate the container using `docker run --name mysql -e MYSQL_ROOT_PASSWORD=password -v ~/storage/docker:/var/lib/mysql -d mysql:latest`
* Execute `docker exec -it mysql bash` to get a bash shell in the container
* Run `mysql -uroot -p` to connect to the MySQL server from within the container
* Run `show databases;` to show the databases in the MySQL server
* Run `use stuff;`
* Run `select * from things;` to show the things in the stuff database - this demonstrates that the database survived the removal of the container
