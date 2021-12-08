FROM hexletbasics/base-image:latest

RUN apt-get update && apt-get install -y openjdk-11-jdk

RUN wget https://github.com/JetBrains/kotlin/releases/download/v1.6.0/kotlin-compiler-1.6.0.zip
RUN unzip kotlin-compiler-1.6.0.zip
RUN rm kotlin-compiler-1.6.0.zip

ENV KTLINT_VERSION 0.43.2
RUN curl -L https://github.com/pinterest/ktlint/releases/download/${KTLINT_VERSION}/ktlint > /opt/ktlint
RUN chmod 777 /opt/ktlint

ENV POWER_ASSERT_VERSION 0.3.1
RUN curl -L https://repo1.maven.org/maven2/com/bnorm/power/kotlin-power-assert/${POWER_ASSERT_VERSION}/kotlin-power-assert-${POWER_ASSERT_VERSION}.jar > /opt/power_assert.jar
RUN chmod 777 /opt/power_assert.jar

WORKDIR /exercises-kotlin
COPY . .

ENV PATH /exercises-kotlin/bin:$PATH
ENV PATH /kotlinc/bin:$PATH
