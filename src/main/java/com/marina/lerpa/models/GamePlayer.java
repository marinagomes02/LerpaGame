package com.marina.lerpa.models;

import java.util.List;
import java.util.UUID;

public record GamePlayer(UUID id, Player player, List<String> steps, Float score) {}
