package com.skypeclone.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING) // Store enum as string in DB
    @Column(length = 20)
    private ERole name;

    public Role(ERole name) {
        this.name = name;
    }
}