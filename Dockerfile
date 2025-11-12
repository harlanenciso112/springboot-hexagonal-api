FROM amazoncorretto:17-alpine

COPY --from=public.ecr.aws/awsguru/aws-lambda-adapter:0.9.1 /lambda-adapter /opt/extensions/lambda-adapter

ENV PORT=8080
ENV AWS_LWA_READINESS_CHECK_PATH=/students/v1/api

WORKDIR /var/task

COPY build/libs/student-service-0.0.1-SNAPSHOT.jar /var/task/app.jar

CMD ["java", "-jar", "app.jar"]