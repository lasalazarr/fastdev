Camel Java Router Project
=========================

To build this project, run the following at the root of the project:

    mvn clean install

To run this project from within Maven use

    mvn camel:run

To see the definition of the endpoint:

http://localhost:9090/rest/customer?_wadl

To execute the call to the restful service, be sure that you set your tool/code/whatever to use the POST verb and point it to:

http://localhost:9090/rest/customer/add/

Your payload should look something like this:

<pre><code>{
  "Customer" : {
    "lastName" : "Salazar",
    "firstName" : "Alberto",
    "address" : "Rep Salv St",
     "city" : "Quito",
    "state" : "PH",
    "zip" : "170102"
  }
}
</pre></code>

For more help see the Apache Camel documentation

    http://camel.apache.org/

Your terminal if everything is ok will look like this:

[INFO] Starting Camel ...
2017-05-14T18:20:48.887 INFO  [org.springframework.context.support.ClassPathXmlApplicationContext] - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@634c2ad5: startup date [Sun May 14 18:20:48 ECT 2017]; root of context hierarchy
2017-05-14T18:20:48.953 INFO  [org.springframework.beans.factory.xml.XmlBeanDefinitionReader] - Loading XML bean definitions from file [/Users/alberto/TRABAJO/REPOSITORIES/fastdev/microservices-camel-blueprint/target/classes/META-INF/spring/camel.xml]
2017-05-14T18:20:55.594 INFO  [org.apache.camel.spring.SpringCamelContext] - Apache Camel 2.18.3 (CamelContext: camel) is starting
2017-05-14T18:20:55.596 INFO  [org.apache.camel.management.ManagedManagementStrategy] - JMX is enabled
2017-05-14T18:21:05.938 INFO  [org.apache.camel.impl.converter.DefaultTypeConverter] - Loaded 205 type converters
2017-05-14T18:21:05.961 INFO  [org.apache.camel.impl.DefaultRuntimeEndpointRegistry] - Runtime endpoint registry is in extended mode gathering usage statistics of all incoming and outgoing endpoints (cache limit: 1000)
2017-05-14T18:21:06.287 INFO  [org.apache.camel.spring.SpringCamelContext] - StreamCaching is not in use. If using streams then its recommended to enable stream caching. See more details at http://camel.apache.org/stream-caching.html
2017-05-14T18:21:06.383 INFO  [org.apache.cxf.endpoint.ServerImpl] - Setting the server's publish address to be http://localhost:9090/rest
2017-05-14T18:21:06.484 INFO  [org.eclipse.jetty.util.log] - Logging initialized @20056ms
2017-05-14T18:21:06.530 INFO  [org.eclipse.jetty.server.Server] - jetty-9.2.15.v20160210
2017-05-14T18:21:06.553 WARN  [org.eclipse.jetty.server.handler.AbstractHandler] - No Server set for org.apache.cxf.transport.http_jetty.JettyHTTPServerEngine$1@45fb361a
2017-05-14T18:21:06.586 INFO  [org.eclipse.jetty.server.ServerConnector] - Started ServerConnector@343b206b{HTTP/1.1}{localhost:9090}
2017-05-14T18:21:06.586 INFO  [org.eclipse.jetty.server.Server] - Started @20158ms
2017-05-14T18:21:06.591 WARN  [org.eclipse.jetty.server.handler.ContextHandler] - Empty contextPath
2017-05-14T18:21:06.597 INFO  [org.eclipse.jetty.server.handler.ContextHandler] - Started o.e.j.s.h.ContextHandler@7889bd6a{/,null,AVAILABLE}
2017-05-14T18:21:06.597 INFO  [org.apache.camel.spring.SpringCamelContext] - Route: route1 started and consuming from: cxfrs://bean:customerService
2017-05-14T18:21:06.597 INFO  [org.apache.camel.spring.SpringCamelContext] - Total 1 routes, of which 1 are started.
2017-05-14T18:21:06.598 INFO  [org.apache.camel.spring.SpringCamelContext] - Apache Camel 2.18.3 (CamelContext: camel) started in 11.004 seconds



