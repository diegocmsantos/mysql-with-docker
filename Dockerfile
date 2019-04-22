From openjdk:8
copy ./target/mysql-with-docker-0.0.1-SNAPSHOT.jar mysql-with-docker-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","mysql-with-docker-0.0.1-SNAPSHOT.jar"]