FROM postgres:16.0-alpine
COPY src/main/resources/shop-dump.sql /docker-entrypoint-initdb.d/init.sql
