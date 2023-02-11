package com.marina.lerpa.repository;

import com.marina.lerpa.repository.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, UUID> {

}
