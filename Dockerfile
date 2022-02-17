FROM amazoncorretto:11-alpine-jdk
VOLUME /tmp
EXPOSE 8081
ARG JAR_FILE=target/profile-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} profile.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh","-c","java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /profile.jar" ]