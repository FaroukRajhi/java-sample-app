FROM java:8
WORKDIR /app
COPY /var/lib/jenkins/workspace/java-pipeline/target/demo1-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "demo1-0.0.1-SNAPSHOT.jar"]
