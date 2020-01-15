#From tomcat:8.0.51-jre8-alpine
#COPY ./target/webexample-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/webexample.war
#CMD ["catalina.sh","run"]

# Websphere liberty profile

FROM websphere-liberty
COPY ./target/webexample-0.0.1-SNAPSHOT.war /config/dropins/webexample.war