package com.marina.lerpa.repository;

import com.marina.lerpa.repository.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GameRepository extends JpaRepository<GameEntity, UUID> {
}
