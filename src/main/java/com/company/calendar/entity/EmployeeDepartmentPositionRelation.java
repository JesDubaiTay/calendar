package com.company.calendar.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import java.util.UUID;

@JmixEntity
@Table(name = "DF_EMP_DEPT_POS_REL") // Замените на фактическое имя вашей таблицы
@Entity(name = "EmployeeDepartmentPositionRelation")
public class EmployeeDepartmentPositionRelation {

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "EMPLOYEE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Employee employee;

    @JoinColumn(name = "DEPARTMENT_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Department department;

    @JoinColumn(name = "POSITION_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Position position;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version; //Обязательно

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}