FROM centos

RUN yum install -y java

VOLUME /tmp

ADD target/ds-address-api-0.0.1-SNAPSHOT.jar ds-address-api.jar

RUN sh -c 'touch ds-address-api.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ds-address-api.jar"]
