package com.marina.lerpa.repository.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="PLAYER")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    public PlayerEntity() {
    }

    public PlayerEntity(String username, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }
}
