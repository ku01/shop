package dev.ku01.shop.model;

public record User(
        long id,
        String name,
        String email,
        String country
) {
}
