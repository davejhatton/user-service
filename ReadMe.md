# Demo service exploring docker docker-compose usage

### Usage Notes

To examine the contents of a running container:

```docker ps```

CONTAINER ID        IMAGE                     COMMAND                  CREATED              STATUS              PORTS                               NAMES
9e2766ae4e9b        davehatton/user_service   "java -jar user_serv…"   About a minute ago   Up About a minute   3306/tcp, 0.0.0.0:8080->8080/tcp    user-service_user-service-spring_1

Get the container ID for the container to be examined and run following:

```docker exec -it 9e2766ae4e9b /bin/bash```


Also:
```docker inspect 9e2766ae4e9b```
Inspect allows the inspection of all docker objects
