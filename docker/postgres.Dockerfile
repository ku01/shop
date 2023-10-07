FROM postgres:16.0-alpine
RUN mkdir /dump
COPY shop-dump.sql /docker-entrypoint-initdb.d/init.sql
