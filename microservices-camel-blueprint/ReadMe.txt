Camel Java Router Project
=========================

To build this project, run the following at the root of the project:

    mvn clean install

To run this project from within Maven use

    mvn camel:run

To execute the call to the restful service, be sure that you set your tool/code/whatever to use the POST verb and point it to:

http://localhost:9090/rest/customer/add/

Your payload should look something like this:


For more help see the Apache Camel documentation

    http://camel.apache.org/



