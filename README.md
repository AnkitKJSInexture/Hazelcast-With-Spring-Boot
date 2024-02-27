


**<span style="text-decoration:underline;">HazelCast Implementation with Spring Boot:</span>**

**Step-1**: Download and Install HazelCast Management Center Zip from _[https://hazelcast.com/open-source-projects/downloads/](https://hazelcast.com/open-source-projects/downloads/)_

![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image.png?raw=true)


**Step-2**: Now go to bin directory in hazelcast-management-center and run this command to start hazelcast-management-center on port 8202 

**_sh start.sh 8202_**

![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(2).png?raw=true)


**Step-3**: Now go to this url _http://localhost:8202/ _on which hazelcast-management-center will be started and create an admin user. After creating admin user and logging in, you will get to see this dashboard of hazelcast-management-center.

![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(3).png?raw=true)


**Step-4:** Now go to Spring Initializr and create a sample spring boot project.

**Step-5:** Make sure to add the following dependency for hazelcast in pom.xml.


```
<dependency>
   <groupId>com.hazelcast</groupId>
   <artifactId>hazelcast-all</artifactId>
   <version>4.1.1</version>
</dependency>
```


**Step-6:** Create Student Entity class, StudentService Interface, StudentServiceImpl class, and application.properties as following:

![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(4).png?raw=true)


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(5).png?raw=true)


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(6).png?raw=true)


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(7).png?raw=true)


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(8).png?raw=true)


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(9).png?raw=true)


**Step-7:** Create one hazelcast.yaml file in /src/main/resources/ in which we will specify the url of hazelcast-management-center and cluster-name to which this spring boot app should be connected.


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(10).png?raw=true)


**Step-8:** Now, create a controller class to perform CRUD operations.

![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(11).png?raw=true)

![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(12).png?raw=true)

 
Here, we have used few of the annotation for caching our data:



1. **@CacheConfig(cacheNames = "students")**
* This annotation will streamline some of the cache configuration into a single place at the class level, so that we don’t have to declare things multiple times

        Here the name of the cache that will be used for caching the data is 'students'.

2. **@Cacheable(key=”#id”)**

        -As the name implies, we can use `@Cacheable` to demarcate methods that are cacheable — that is, methods for which the result is stored in the cache so that, on subsequent invocations (with the same arguments), the value in the cache is returned without having to actually invoke the method. 

        -Here, we are caching the getStudentById() method based on its id field.

3. **@CachePut(key= ‘#id’)**

        -It is generally used with update methods if we want our cache to be updated with the result of the method execution.

4. **@CacheEvict(key=’#id’)**

        - The `@CacheEvict` annotation is used to remove one or more entries from a cache. When a method annotated with `@CacheEvict` is called, Spring will remove the cached data associated with the specified cache name and key (or keys) along with the method execution.


**Step-9:** Now, run the spring boot app.

![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(13).png?raw=true)


**Step-10:** We can test that caching using hazelcast is working by using various endpoints of controller class using postman.

![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(14).png?raw=true)


In the first call to the method in which we are using caching, time for doing that operation will be very high since it will be interacting with the database. After that all subsequent calls to that method will fetch data from cache so it will be very quick.

**Github Link to the demo Project:**

_[https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/tree/main](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/tree/main)_

