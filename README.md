<!-----

You have some errors, warnings, or alerts. If you are using reckless mode, turn it off to see inline alerts.
* ERRORs: 0
* WARNINGs: 0
* ALERTS: 14

Conversion time: 2.682 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs to Markdown version 1.0β35
* Tue Feb 27 2024 04:23:16 GMT-0800 (PST)
* Source doc: HazelCast Implementation
* This is a partial selection. Check to make sure intra-doc links work.
* This document has images: check for >>>>>  gd2md-html alert:  inline image link in generated source and store images to your server. NOTE: Images in exported zip file from Google Docs may not appear in  the same order as they do in your doc. Please check the images!

----->


<p style="color: red; font-weight: bold">>>>>>  gd2md-html alert:  ERRORs: 0; WARNINGs: 0; ALERTS: 14.</p>
<ul style="color: red; font-weight: bold"><li>See top comment block for details on ERRORs and WARNINGs. <li>In the converted Markdown or HTML, search for inline alerts that start with >>>>>  gd2md-html alert:  for specific instances that need correction.</ul>

<p style="color: red; font-weight: bold">Links to alert messages:</p><a href="#gdcalert1">alert1</a>
<a href="#gdcalert2">alert2</a>
<a href="#gdcalert3">alert3</a>
<a href="#gdcalert4">alert4</a>
<a href="#gdcalert5">alert5</a>
<a href="#gdcalert6">alert6</a>
<a href="#gdcalert7">alert7</a>
<a href="#gdcalert8">alert8</a>
<a href="#gdcalert9">alert9</a>
<a href="#gdcalert10">alert10</a>
<a href="#gdcalert11">alert11</a>
<a href="#gdcalert12">alert12</a>
<a href="#gdcalert13">alert13</a>
<a href="#gdcalert14">alert14</a>

<p style="color: red; font-weight: bold">>>>>> PLEASE check and correct alert issues and delete this message and the inline alerts.<hr></p>


**<span style="text-decoration:underline;">HazelCast Implementation with Spring Boot:</span>**

**Step-1: **Download and Install HazelCast Management Center Zip from _[https://hazelcast.com/open-source-projects/downloads/](https://hazelcast.com/open-source-projects/downloads/)_



<p id="gdcalert1" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image1.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert2">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image.png?raw=true)


**Step-2**: Now go to bin directory in hazelcast-management-center and run this command to start hazelcast-management-center on port 8202 

**_sh start.sh 8202_**



<p id="gdcalert2" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image2.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert3">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(2).png?raw=true)


**Step-3**: Now go to this url _http://localhost:8202/ _on which hazelcast-management-center will be started and create an admin user. After creating admin user and logging in, you will get to see this dashboard of hazelcast-management-center. \
 \


<p id="gdcalert3" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image3.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert4">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(3).png?raw=true)


**Step-4:** Now go to Spring Initializr and create a sample spring boot project.

**Step-5: **Make sure to add the following dependency for hazelcast in pom.xml.


```
<dependency>
   <groupId>com.hazelcast</groupId>
   <artifactId>hazelcast-all</artifactId>
   <version>4.1.1</version>
</dependency>
```


**Step-6: **Create Student Entity class, StudentService Interface, StudentServiceImpl class, and application.properties as following:



<p id="gdcalert4" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image4.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert5">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(4).png?raw=true)




<p id="gdcalert5" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image5.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert6">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(5).png?raw=true)




<p id="gdcalert6" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image6.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert7">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(6).png?raw=true)


<p id="gdcalert7" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image7.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert8">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(7).png?raw=true)




<p id="gdcalert8" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image8.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert9">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(8).png?raw=true)




<p id="gdcalert9" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image9.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert10">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(9).png?raw=true)


**Step-7:** Create one hazelcast.yaml file in /src/main/resources/ in which we will specify the url of hazelcast-management-center and cluster-name to which this spring boot app should be connected.



<p id="gdcalert10" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image10.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert11">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(10).png?raw=true)


**Step-8: **Now, create a controller class to perform CRUD operations.

 \


<p id="gdcalert11" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image11.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert12">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(11).png?raw=true)




<p id="gdcalert12" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image12.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert13">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(12).png?raw=true)
 \
 \
Here, we have used few of the annotation for caching our data:



1. **<code>@CacheConfig(cacheNames = "students")</code></strong>
* This annotation will streamline some of the cache configuration into a single place at the class level, so that we don’t have to declare things multiple times

        Here the name of the cache that will be used for caching the data is <em>students.</em>

2. **@Cacheable(key=”#id”)**

        -As the name implies, we can use `@Cacheable` to demarcate methods that are cacheable — that is, methods for which the result is stored in the cache so that, on subsequent invocations (with the same arguments), the value in the cache is returned without having to actually invoke the method. 


        - Here, we are caching the getStudentById() method based on its id field.

3. **@CachePut(key= ‘#id’)**

        -It is generally used with update methods if we want our cache to be updated with the result of the method execution.

4. **@CacheEvict(key=’#id’)**

        - The `@CacheEvict` annotation is used to remove one or more entries from a cache. When a method annotated with `@CacheEvict` is called, Spring will remove the cached data associated with the specified cache name and key (or keys) along with the method execution.


**Step-9: **Now, run the spring boot app.



<p id="gdcalert13" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image13.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert14">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(13).png?raw=true)


**Step-10:** We can test that caching using hazelcast is working by using various endpoints of controller class using postman. \
 \


<p id="gdcalert14" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image14.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert15">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/blob/main/src/main/resources/MicrosoftTeams-image(14).png?raw=true)


In the first call to the method in which we are using caching, time for doing that operation will be very high since it will be interacting with the database. After that all subsequent calls to that method will fetch data from cache so it will be very quick.

**Github Link to the demo Project:**

_[https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/tree/main](https://github.com/AnkitKJSInexture/Hazelcast-With-Spring-Boot/tree/main)_

 \
 \

