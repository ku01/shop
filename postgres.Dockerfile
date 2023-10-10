FROM postgres:16.0-alpine
COPY ../src/test/resources/shop-dump.sql /docker-entrypoint-initdb.d/init.sql
