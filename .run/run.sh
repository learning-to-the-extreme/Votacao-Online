#!/bin/sh

printf "----------------------- Iniciando Script -----------------------"

printf " Iniciando build java com Maven"

printf "mvn clean ......"
mvn clean

printf "mvn install ....."
mvn install

printf "navegando para pasta do front end"
cd src-web

printf "Instalando dependencias do front end"
yarn start --web
