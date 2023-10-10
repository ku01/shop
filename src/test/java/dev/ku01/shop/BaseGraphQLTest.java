package dev.ku01.shop;

import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.MountableFile;

abstract public class BaseGraphQLTest {
    private static final String DATABASE_NAME = "shop";

    public static PostgreSQLContainer postgreSQLContainer =
            (PostgreSQLContainer)
                    new PostgreSQLContainer("postgres:16.0-alpine")
                            .withUsername("sa")
                            .withPassword("sa")
                            .withCopyFileToContainer(MountableFile.forClasspathResource("shop-dump.sql"), "/docker-entrypoint-initdb.d/init.sql");

    static {
        postgreSQLContainer.start();
    }

    static class PostgresqlInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
        @Override
        public void initialize(ConfigurableApplicationContext applicationContext) {
            TestPropertyValues.of(
                    String.format("spring.datasource.url=jdbc:postgresql://%s:%s/%s", postgreSQLContainer.getHost(), postgreSQLContainer.getFirstMappedPort(), DATABASE_NAME),
                    "spring.datasource.username=" + postgreSQLContainer.getUsername(),
                    "spring.datasource.password=" + postgreSQLContainer.getPassword()
            ).applyTo(applicationContext.getEnvironment());
        }
    }
}
