package com.marina.lerpa.repository.entities;


import com.marina.lerpa.models.GameStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "GAME")
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private GameStatus status;

    public GameEntity() {
    }

    public GameEntity(LocalDateTime date, GameStatus status) {
        this.date = date;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public GameStatus getStatus() {
        return status;
    }
}
