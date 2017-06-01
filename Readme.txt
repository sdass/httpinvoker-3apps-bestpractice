maven multi-module spring-mvc. 

1. multimod-invoker is a multi-module maven project housed two modules(project). Its package type is pom. 
Exist modules element with two modules.
one module (httpinvoker-client) is jar
other module (httpinvoker-service) is war (webapp). (main and listener service running on tomcat container)  
httpinvoker-client keeps only serialized model class and interface. But no implementation. This module as jar (httpinvoker-client.jar) becomes dependency to independent client app as on step 2. 
httpinvoker-service pom has dependency to httpinvoker-client.jar. Needed to implement the interfaces. This(httpinvoker-service) application is the one and only place where implementation of interfaces (of httpinvoker-client) are done and candidate for future modification. The independent client never need to modify for new interface additions. 
Both the module has parent as multimod-invoker.
[mainly xml configuration]

2. Independent client app (clienthttp) is a commandline  (.jar) app. As a client it consumes http invoker service. The pom dependency [com.subra, httpinvoker-client] alleviates maintenance headache for interface and datastructure change. main pieces pom, main/resources/client-beans.xml, MainServiceAppContextTesting.java

3. How to run? install multimod-invoker. Run httpinvoker-service on tomcat (http://localhost:8080/httpinvoker-service/ will show Hello World a page). Means it is ready.
Now actual test. Build clienthttp application. Run main method on MainServiceAppContextTesting.java
output:
cubes=125
getCalcInOut=CalcOutput [input=4, output=64]
getCapital=Hartford
getCapitalInOut=CaptitalOutput [state=Alabama, capital=Montgomery]