FROM livingobjects/jre8
VOLUME /tmp
ADD eureka-server/target/eureka-server.jar app.jar
ADD eureka-server/src/main/docker/localtime /localtime
RUN bash -c 'mv /localtime /etc/localtime'
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Duser.timezone=GMT+08 -Xx512m -Xms512m ","-jar","/app.jar"]
