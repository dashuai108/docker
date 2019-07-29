FROM centos:7
#基于centos镜像
LABEL maintainer="1363198181@qq.com"				
#标注作者联系方式等信息
WORKDIR /usr/local/src/							
#当前工作目录
ADD nginx-1.15.2.tar.gz ./		  
#本地文件在当前目录，ADD则直接解压到当前工作目录
WORKDIR nginx-1.15.2/								
#工作目录进入到解压后目录
RUN yum install -y gcc gcc-c++ && \					
#运行shell命令
    yum install -y pcre pcre-devel && \			
    yum install -y zlib zlib-devel && \
    yum install -y openssl openssl-devel libssl-dev && \
    ./configure --prefix=/usr/local/nginx  && \
    make  && make install
RUN echo "daemon off;" >> /usr/local/nginx/conf/nginx.conf
ENV PATH /usr/local/nginx/sbin:$PATH
EXPOSE 80
#暴露端口为80
CMD ["nginx"]
