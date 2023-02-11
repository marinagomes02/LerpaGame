package com.marina.lerpa.repository.entities;


import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name="GAMEPLAYER")
public class GamePlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "playerId")
    private PlayerEntity player;

    @Column(name = "steps")
    private List<String> steps;

    @Column(name = "score")
    private Float score;

    @OneToOne
    @JoinColumn(name = "gameId")
    private GameEntity game;

    public GamePlayerEntity() {
    }

    public GamePlayerEntity(PlayerEntity player, List<String> steps, Float score, GameEntity game) {
        this.player = player;
        this.steps = steps;
        this.score = score;
        this.game = game;
    }

    public UUID getId() {
        return id;
    }

    public PlayerEntity getPlayer() {
        return player;
    }

    public List<String> getSteps() {
        return steps;
    }

    public Float getScore() {
        return score;
    }

    public GameEntity getGame() {
        return game;
    }
}
