#!/bin/sh

printf "----------------------- Iniciando Script -----------------------"

printf " Iniciando build java com Maven"

printf "mvn clean ......"
mvn clean

printf "mvn install ....."
mvn install

printf "mvn quarkus ....."
mvn compile quarkus:dev