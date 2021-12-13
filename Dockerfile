FROM hexletbasics/base-image:latest

RUN apt-get update && apt-get install -yq openjdk-17-jdk

ARG KOTLIN_VERSION=1.6.0
RUN wget -q https://github.com/JetBrains/kotlin/releases/download/v${KOTLIN_VERSION}/kotlin-compiler-${KOTLIN_VERSION}.zip
RUN unzip -q kotlin-compiler-${KOTLIN_VERSION}.zip
RUN rm kotlin-compiler-${KOTLIN_VERSION}.zip
ENV PATH=/kotlinc/bin:$PATH

ARG KTLINT_VERSION=0.43.2
RUN curl -sL https://github.com/pinterest/ktlint/releases/download/${KTLINT_VERSION}/ktlint > /opt/ktlint
RUN chmod 777 /opt/ktlint

ARG CHECKSTYLE_VERSION=9.0.1
RUN curl -sL https://github.com/checkstyle/checkstyle/releases/download/checkstyle-${CHECKSTYLE_VERSION}/checkstyle-${CHECKSTYLE_VERSION}-all.jar > /opt/checkstyle.jar
RUN chmod 777 /opt/checkstyle.jar

ARG COMMONS_LANG3_VERSION=3.12.0
RUN curl -sL https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/${COMMONS_LANG3_VERSION}/commons-lang3-${COMMONS_LANG3_VERSION}.jar > /opt/commons_lang3.jar
RUN chmod 777 /opt/commons_lang3.jar

ARG ASSERTJ_VERSION=3.21.0
RUN curl -sL https://repo1.maven.org/maven2/org/assertj/assertj-core/${ASSERTJ_VERSION}/assertj-core-${ASSERTJ_VERSION}.jar > /opt/assertj.jar
RUN chmod 777 /opt/assertj.jar

WORKDIR /exercises-kotlin

ENV PATH=/exercises-kotlin/bin:$PATH
ENV CLASSPATH=.:/opt/commons_lang3.jar:/opt/assertj.jar

COPY . .
