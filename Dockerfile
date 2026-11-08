FROM eclipse-temurin:25-jdk AS java

FROM hexletbasics/base-image:latest AS toolchain

COPY --from=java /opt/java/openjdk /opt/java/openjdk
ENV JAVA_HOME=/opt/java/openjdk
ENV KOTLIN_HOME=/opt/kotlinc
ENV PATH="/opt/java/openjdk/bin:/opt/kotlinc/bin:/exercises-kotlin/bin:$PATH"

ARG KOTLIN_VERSION=2.4.21
RUN curl --fail --location --retry 3 \
      "https://github.com/JetBrains/kotlin/releases/download/v${KOTLIN_VERSION}/kotlin-compiler-${KOTLIN_VERSION}.zip" \
      --output /tmp/kotlin.zip \
  && unzip -q /tmp/kotlin.zip -d /opt \
  && rm /tmp/kotlin.zip

ARG KTLINT_VERSION=1.8.0
RUN curl --fail --location --retry 3 \
      "https://github.com/ktlint/ktlint/releases/download/${KTLINT_VERSION}/ktlint" \
      --output /opt/ktlint.jar \
  && printf '#!/bin/sh\nexec java -jar /opt/ktlint.jar "$@"\n' > /usr/local/bin/ktlint \
  && chmod +x /usr/local/bin/ktlint

# Avoid rescanning the JDK module image and dependency archives on each submission.
RUN mkdir -p /opt/kotlin-classpath \
  && jimage extract --dir /tmp/java-modules "$JAVA_HOME/lib/modules" \
  && cp -R /tmp/java-modules/java.base/. /opt/kotlin-classpath/ \
  && cd /opt/kotlin-classpath \
  && jar xf /opt/kotlinc/lib/kotlin-stdlib.jar \
  && jar xf /opt/kotlinc/lib/annotations-13.0.jar \
  && rm -rf /tmp/java-modules

ENV KOTLIN_FAST_CLASSPATH=/opt/kotlin-classpath

# Train the compiler once per toolchain and architecture, independently of lessons.
COPY bin/compile.sh /usr/local/bin/kotlin-compile
COPY lib/CompilerWarmup.kt /tmp/kotlin-warmup/CompilerWarmup.kt
RUN KOTLIN_AOT_CACHE_OUTPUT=/opt/kotlin-compiler.aot \
      /usr/local/bin/kotlin-compile /tmp/kotlin-warmup/CompilerWarmup.kt \
      -jvm-target 25 -d /tmp/kotlin-warmup/classes \
  && rm -rf /tmp/kotlin-warmup

ENV KOTLIN_AOT_CACHE=/opt/kotlin-compiler.aot

FROM toolchain AS course

WORKDIR /exercises-kotlin
COPY . .

ENV BUILD_PATH=/build/kotlin
RUN make test
