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
 - Where to get maven: https://maven.apache.org/download.cgi
 - http://stackoverflow.com/a/40818167/1060686

