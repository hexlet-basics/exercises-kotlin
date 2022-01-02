FROM hexletbasics/base-image:latest

# NOTE: связка jdk_8 - kotlin_1.3.71 работает быстрее чем актуальные версии.
# Для упражнений на КБ нет необходимости использовать самые последние версии.
ARG JAVA_VERSION=8
RUN apt-get update && apt-get install -yq openjdk-${JAVA_VERSION}-jdk
ENV JAVA_HOME=/usr/lib/jvm/java-${JAVA_VERSION}-openjdk-amd64

ARG KOTLIN_VERSION=1.3.71
RUN wget -q https://github.com/JetBrains/kotlin/releases/download/v${KOTLIN_VERSION}/kotlin-compiler-${KOTLIN_VERSION}.zip \
  && unzip -q kotlin-compiler-${KOTLIN_VERSION}.zip \
  && rm kotlin-compiler-${KOTLIN_VERSION}.zip
ENV KOTLIN_HOME=/kotlinc
ENV PATH=$KOTLIN_HOME/bin:$PATH

ARG KTLINT_VERSION=0.43.2
RUN curl -sL https://github.com/pinterest/ktlint/releases/download/${KTLINT_VERSION}/ktlint > /opt/ktlint

ARG CHECKSTYLE_VERSION=9.2
RUN curl -sL https://github.com/checkstyle/checkstyle/releases/download/checkstyle-${CHECKSTYLE_VERSION}/checkstyle-${CHECKSTYLE_VERSION}-all.jar > /opt/checkstyle.jar

ARG COMMONS_LANG3_VERSION=3.12.0
RUN curl -sL https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/${COMMONS_LANG3_VERSION}/commons-lang3-${COMMONS_LANG3_VERSION}.jar > /opt/commons_lang3.jar

ARG ASSERTJ_VERSION=3.21.0
RUN curl -sL https://repo1.maven.org/maven2/org/assertj/assertj-core/${ASSERTJ_VERSION}/assertj-core-${ASSERTJ_VERSION}.jar > /opt/assertj.jar

ENV BUILD_PATH=/build
ENV CLASSPATH=$BUILD_PATH/classes
RUN mkdir -p $CLASSPATH

# NOTE: распаковка jar файлов в процессе компиляции требует ресурсов.
# Подготоваливаем директорию с уже распакованными файлами классов
RUN cd $CLASSPATH && jar xf $JAVA_HOME/jre/lib/rt.jar
RUN cd $CLASSPATH \
  && for i in $(find $KOTLIN_HOME/lib -type f -name *.jar); do jar xf $i; done
RUN cd $CLASSPATH \
  && jar xf /opt/commons_lang3.jar \
  && jar xf /opt/assertj.jar

WORKDIR /exercises-kotlin

ENV PATH=/exercises-kotlin/bin:$PATH

COPY . .

# NOTE: компилируем утилиты для тестов
RUN cd src && javac *.java -d $CLASSPATH

# NOTE: компиляция решения и файла с тестами.
# Это позволит не компилировать заново файлы с тестами (они не не меняются) 
RUN COMPILE_TESTS=1 make test
