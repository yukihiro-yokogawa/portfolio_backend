FROM adoptopenjdk/openjdk16:alpine as production


WORKDIR /usr/project/app

ENV DATABASE_URL=jdbc:postgresql://portfolio_db:5432/portfolio
ENV DATABASE_USER=portfolio
ENV DATABASE_PASSWORD=fbfqq123fdsfewr675lwswer390wer

COPY ./build/libs/portfolio_backend-0.0.1-SNAPSHOT.jar ./

ENTRYPOINT ["java","-jar","./portfolio_backend-0.0.1-SNAPSHOT.jar"]