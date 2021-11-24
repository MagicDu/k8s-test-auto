FROM  mcr.microsoft.com/java/jdk:8u192-zulu-alpine
MAINTAINER david "soulhappy_xyl@xyloa.cn.com"
ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ADD question.jar question.jar
EXPOSE 9527
ENTRYPOINT ["java","-Xms750m","-Xmx4096m","-server","-jar","/question.jar"]