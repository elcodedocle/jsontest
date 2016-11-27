[![Build Status](https://travis-ci.org/elcodedocle/jsontest.svg?branch=master)](https://travis-ci.org/elcodedocle/jsontest)

JSONtest
========
Demo for deploying and consuming a simple JSON RESTful service

## Clone
```
git clone https://github.com/elcodedocle/jsontest
```

## Build
```
cd jsontest
mvn package
```

## Deploy service
```
java -jar target/jsontest-0.0.1-SNAPSHOT.jar
```

## Run test
```
java -jar target/jsontest-0.0.1-SNAPSHOT.jar runtest 
```

## See also

 - The [JsonTest](src/main/java/com/elcodedocle/jsontest/JsonTest.java) class consuming the service
 - https://elcodedocle-jsontest.herokuapp.com/apps for a live deployment of the latest travisCI passed build of the service
 - Where to get git: https://git-scm.com/downloads
 - Where to get the [latest Java 1.8 SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
 - Where to get maven: https://maven.apache.org/download.cgi
 - http://stackoverflow.com/a/40818167/1060686

