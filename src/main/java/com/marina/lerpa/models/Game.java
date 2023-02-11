package com.marina.lerpa.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record Game(UUID id, LocalDateTime date, List<Player> players, GameStatus status) {}
