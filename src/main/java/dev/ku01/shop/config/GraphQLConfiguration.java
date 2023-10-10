package dev.ku01.shop.config;

import dev.ku01.shop.resolver.OrderItemResolver;
import dev.ku01.shop.resolver.OrderResolver;
import dev.ku01.shop.query.Query;
import org.jooq.DSLContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfiguration {
    private final DSLContext dsl;

    public GraphQLConfiguration(DSLContext dsl) {
        this.dsl = dsl;
    }

    @Bean
    public OrderResolver orderResolver() {
        return new OrderResolver(dsl);
    }

    @Bean
    public OrderItemResolver orderItemResolver() {
        return new OrderItemResolver(dsl);
    }

    @Bean
    public Query query() {
        return new Query(orderResolver(), orderItemResolver());
    }
}
