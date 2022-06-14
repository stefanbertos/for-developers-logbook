# for-developers-logbook
This is sample app to showcase sample request/response login with Logbook and SpringBoot

To run this use:
'gradlew bootRun'

http://localhost:8888/swagger-ui.html

see also https://github.com/zalando/logbook

The logbook logger must be configured to trace level in order to log the requests and responses. 
With Spring Boot 2 (using Logback) this can be accomplished by adding the following line to your application.yaml
