FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/CalculatorApp-1.0-SNAPSHOT.jar app.jar    #Change according to your project structure.

ENTRYPOINT ["java", "-jar", "app.jar"]

