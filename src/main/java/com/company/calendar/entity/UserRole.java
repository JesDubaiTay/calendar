package com.company.calendar.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import java.util.UUID;

@JmixEntity
@Table(name = "CS_USER_ROLE")
public class UserRole {

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY) // Указываем связь "многие к одному" с User
    @JoinColumn(name = "USER_ID") // Указываем внешний ключ в таблице CS_USER_ROLE
    private User user;

    @Column(name = "ROLE_NAME") // Название роли (например, "ADMIN", "USER")
    private String roleName;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}