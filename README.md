# spring-boot-rest-with-jpa


Go to terminal where you can build you project.
 
# Check Docker version on system?
  * command $: docker --version
  * OUTPUT : Docker version 19.03.5, build 633a0ea

# create docker image
 * command $: docker build -f Dockerfile -t spring-boot-jpa-docker .
 * OUTPUT : Sending build context to Docker daemon  95.12MB
Step 1/4 : FROM openjdk:8
8: Pulling from library/openjdk
50e431f79093: Pull complete 
dd8c6d374ea5: Pull complete 
c85513200d84: Pull complete 
55769680e827: Pull complete 
e27ce2095ec2: Pull complete 
5943eea6cb7c: Pull complete 
3ed8ceae72a6: Pull complete 
Digest: sha256:f815268bb2af51279b3361666c0b702e1a61f9eec83d817c6df49b78af768922
Status: Downloaded newer image for openjdk:8
 ---> cdf26cc71b50
Step 2/4 : ADD target/spring-boot-jpa-docker.jar spring-boot-jpa-docker.jar
 ---> 4aaaa9beedea
Step 3/4 : EXPOSE 8082
 ---> Running in 67720ef3db81
Removing intermediate container 67720ef3db81
 ---> c01eb4f01c55
Step 4/4 : ENTRYPOINT ["java" ,"-jar", "spring-boot-jpa-docker.jar"]
 ---> Running in 4bbd06e14d66
Removing intermediate container 4bbd06e14d66
 ---> 273cb3eb3584
Successfully built 273cb3eb3584
Successfully tagged spring-boot-jpa-docker:latest
Hemantas-MacBook-Pro:spring-boot-rest-with-jpa hemantapaudel$ 

# check docker images on your system
 docker images
 REPOSITORY               TAG                 IMAGE ID            CREATED             SIZE
spring-boot-jpa-docker   latest              273cb3eb3584        10 minutes ago      559MB
openjdk                  8                   cdf26cc71b50        5 days ago          510MB


# Run docker image and map port internal and external 
docker run -p 8082:8082 spring-boot-jpa-docker