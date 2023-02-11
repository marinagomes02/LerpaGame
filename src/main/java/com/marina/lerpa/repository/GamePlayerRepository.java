package com.marina.lerpa.repository;

import com.marina.lerpa.repository.entities.GamePlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GamePlayerRepository extends JpaRepository<GamePlayerEntity, UUID> {
}
