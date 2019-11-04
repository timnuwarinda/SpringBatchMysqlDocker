## Instructions on how to Run Mini Project 1

### Load Project

Open Project in Intellij IDE or any other IDE

### From terminal

Open the `terminal` via Intellij and run the following commands

    $ ./mvnw install
    
    $ docker build . -t spring-batch
    
    $ docker-compose up


### Usage

- After running the commands above and the Application has started, go to `postman` or any other REST client and do the following;

    * Make a `POST` call to `http://localhost:8081/authenticate` with this JSON body; 
        
        ```json
        {
            "username":"username",
            "password":"password"
        }
        ```

    * Copy the token returned and use it to set Authorization Headers for the next call.
    * Set the Authorization Header to Type `Bearer Token` and enter the token obtained above, then make a `GET` call to `http://localhost:8081/load`
    * The Students payload will be returned from the DB