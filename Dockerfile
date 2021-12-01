FROM hexletbasics/base-image:latest

RUN apt-get update && apt-get install -y openjdk-11-jdk

RUN wget https://github.com/JetBrains/kotlin/releases/download/v1.6.0/kotlin-compiler-1.6.0.zip
RUN unzip kotlin-compiler-1.6.0.zip
RUN rm kotlin-compiler-1.6.0.zip

WORKDIR /exercises-kotlin
COPY . .

ENV PATH /exercises-kotlin/bin:$PATH
ENV PATH /kotlinc/bin:$PATH
