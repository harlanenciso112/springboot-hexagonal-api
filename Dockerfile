# Cambia la base a una no gestionada (amazoncorretto:17 o amazoncorretto:17-alpine para más ligereza)
FROM amazoncorretto:17-alpine

# Copia el Lambda Web Adapter (sin cambios)
COPY --from=public.ecr.aws/awsguru/aws-lambda-adapter:0.9.1 /lambda-adapter /opt/extensions/lambda-adapter

# Configura el puerto (8080 por defecto en Spring Boot)
ENV PORT=8080
ENV AWS_LWA_READINESS_CHECK_PATH=/students/v1/api

# Establece el directorio de trabajo (compatible con Lambda)
WORKDIR /var/task

# Copia tu JAR
COPY build/libs/student-service-0.0.1-SNAPSHOT.jar /var/task/app.jar

# Comando para ejecutar la app (sin handler)
CMD ["java", "-jar", "app.jar"]