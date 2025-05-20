package com.company.calendar.entity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import io.jmix.core.metamodel.annotation.InstanceName;
import java.util.Objects;
import java.util.UUID;

@JmixEntity
@Table(name = "comissions")
public class Comissions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "chairman_full_name")
    private String chairmanFullName;

    @Column(name = "head_of_staff_full_name")
    private String headOfStaffFullName;

    public Comissions() {
    }

    public Comissions(String name, String chairmanFullName, String headOfStaffFullName) {
        this.name = name;
        this.chairmanFullName = chairmanFullName;
        this.headOfStaffFullName = headOfStaffFullName;
    }

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

    public String getChairmanFullName() {
        return chairmanFullName;
    }

    public void setChairmanFullName(String chairmanFullName) {
        this.chairmanFullName = chairmanFullName;
    }

    public String getHeadOfStaffFullName() {
        return headOfStaffFullName;
    }

    public void setHeadOfStaffFullName(String headOfStaffFullName) {
        this.headOfStaffFullName = headOfStaffFullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comissions that = (Comissions) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(chairmanFullName, that.chairmanFullName) && Objects.equals(headOfStaffFullName, that.headOfStaffFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, chairmanFullName, headOfStaffFullName);
    }

    @Override
    public String toString() {
        return "Comissions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chairmanFullName='" + chairmanFullName + '\'' +
                ", headOfStaffFullName='" + headOfStaffFullName + '\'' +
                '}';
    }
}