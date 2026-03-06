# Medibuddy

Medibuddy app is backend application which exposes the rest endpoints for serving main feature of booking
consultation appointments with doctors.

### Tech stacks required

1. Java 21 with SpringBoot setup
2. Postgresql Database for data persistence

### Setup Postgresql using docker

1. Have the docker running on your machine
2. Go to docker hub page for postgres => `https://hub.docker.com/_/postgres
3. Copy the docker pull command by selecting the appropriate version, e.g `docker pull postgres:16.11-alpine3.23`
4. Run the command from your local terminal to pull the postgres docker image
5. Run the following command to run the docker image with creation of container(This is 1st time try)
   `docker run --name postgres -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres`
6. Once the container is created, for next times you can use the command `docker start postgres` to start the same
   container instance
7. All the Rest endpoints are kept as bruno collection under `medibuddy/medibuddy` directory.