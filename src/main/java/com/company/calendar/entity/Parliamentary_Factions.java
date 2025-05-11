package com.company.calendar.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import io.jmix.core.metamodel.annotation.InstanceName;

@JmixEntity
@Table(name = "CS_PARLIAMENTARY_FACTIONS")
@Entity(name = "cs_Parliamentary_Factions")
public class Parliamentary_Factions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PL_ID", nullable = false)
    private Long id;

    @Column(name = "PL_NAME", nullable = false)
    @InstanceName
    private String name;

    @NotNull
    @Column(name = "FACTION_LEADER", nullable = false)
    private String factionLeader;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public void setFactionLeader(String factionLeader) {
        this.factionLeader = factionLeader;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFactionLeader() {
        return factionLeader;
    }
    @Override
    public String toString() {
        return "Депутатская фракция " + name + "\n" +
                "Руководитель фракции - " + factionLeader;
    }
}