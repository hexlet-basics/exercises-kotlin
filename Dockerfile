FROM hexletbasics/base-image:latest

RUN apt-get update && apt-get install -y openjdk-11-jdk

RUN wget https://github.com/JetBrains/kotlin/releases/download/v1.6.0/kotlin-compiler-1.6.0.zip
RUN unzip kotlin-compiler-1.6.0.zip
RUN rm kotlin-compiler-1.6.0.zip

ENV DETEKT_VERSION 1.19.0
RUN curl -L https://github.com/detekt/detekt/releases/download/v${DETEKT_VERSION}/detekt-cli-${DETEKT_VERSION}-all.jar > /opt/detekt.jar
RUN chmod 777 /opt/detekt.jar

ENV POWER_ASSERT_VERSION 0.11.0
RUN curl -L https://plugins.gradle.org/m2/gradle/plugin/com/bnorm/power/kotlin-power-assert-gradle/${POWER_ASSERT_VERSION}/kotlin-power-assert-gradle-${POWER_ASSERT_VERSION}.jar > /opt/power_assert.jar
RUN chmod 777 /opt/power_assert.jar

WORKDIR /exercises-kotlin
COPY . .

ENV PATH /exercises-kotlin/bin:$PATH
ENV PATH /kotlinc/bin:$PATH
