package com.company.calendar.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import org.atmosphere.config.service.Message;

import java.util.UUID;

@JmixEntity
@Table(name = "CS_HALL")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HALL_ID")
    private UUID id; // Идентификатор зала

    @Column(name = "HALL_NAME", nullable = false)
    private String name;

    @Column(name = "CAPACITY")
    private Integer capacity;

    @Column(name = "LOCATION")
    private String location;

    // Конструкторы
    public Hall() {
    }

    public Hall(String name, Integer capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
    }

    // Геттеры и сеттеры
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public static final String CAPACITY_MESSAGE = "entity.Hall.capacity";

    @Transient
    public String getDisplayName() {
        return name + " (" + capacity + ")";
    }
    @Override
    public String toString() {
        return getDisplayName();
    }
}