
# fastdev EN

fastdev7 contains code blueprint projects based on create microservices using different frameworks based on Java such as: Vert.x, Spring boot or JEE; and create front-end templates using: React, ReactNative or Angular. For distribution and CI we use: Docker, and Jenkins

Several code and experiences were shared by a framework that was developed in 2008 and 2009 by Advance Latam Team (www.advlatam.com). This source code are now release as a new open source project to re define it and launch a new microservices platform based on metadata 

----------------------
|    frontend       |
---------------------- 1.......n modules for User interfaces based on React and React Native
            ^
            |
----------------------
|    Backend       |
---------------------- 1.....n Based on Vert.x or Apache Camel or Spring boot.
            ^
            |
----------------------
|    Metadata framework       |  1.....n Grid Cache or metadata definition of application or business scope micro services
-----------------------------------


-----------------------------------
|    Monitoring and Logging       |
-----------------------------------
We use to collect log and transaction data Logstash (part of the Elasticsearch/Logstash/Kibana stack) to collect, aggregate, and parse the data, and then have Logstash feed this data into Elasticsearch. Once the data is in Elasticsearch, you can run searches and aggregations to mine any information that is of interest to you.