FROM hexletbasics/base-image:latest

WORKDIR /exercises-kotlin

RUN apt-get update && apt-get install -y openjdk-11-jdk

COPY . .

ENV PATH /exercises-kotlin/bin:$PATH

RUN chmod -R 777 /exercises-kotlin/kotlinc/bin
ENV PATH /exercises-kotlin/kotlinc/bin:$PATH