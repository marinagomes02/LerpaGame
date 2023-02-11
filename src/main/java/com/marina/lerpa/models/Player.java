package com.marina.lerpa.models;

import java.util.UUID;

public record Player(UUID id, String firstName, String lastName, Double score) {
}
