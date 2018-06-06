#!/usr/bin/env bash



echo 'The following command runs and outputs the execution of your Java'
echo 'application (which Jenkins built using Maven) to the Jenkins UI.'

java -jar target/my-app-1.0-SNAPSHOT.jar
