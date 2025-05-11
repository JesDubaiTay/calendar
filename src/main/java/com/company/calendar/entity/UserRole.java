package com.company.calendar.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.UUID;

@JmixEntity
@Table(name = "CS_USER_ROLE")
@Entity(name = "cs_UserRole")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")  // Связь с User (например, внешним ключом)
    private Long userId;

    @Column(name = "role_name") // Название роли (например, "ADMIN", "USER")
    private String roleName;
}