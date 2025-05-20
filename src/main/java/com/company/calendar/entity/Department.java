package com.company.calendar.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.SystemLevel;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "DF_DEPARTMENT")
public class Department {

    @Id
    @Column(name = "ID")
    @JmixGeneratedValue
    private UUID id;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    @Column(name = "CODE", length = 20)
    private String code;  // Код

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_DEPARTMENT_ID")
    private Department parentDepartment;  // (N:1)

   @OneToMany(mappedBy = "department") //  CorrespondentAttachment -> department
   private List<CorrespondentAttachment> correspondentAttachments; //(1:N)

    @SystemLevel
    @Column(name = "CREATE_TS")
    private Date createTs;

    @SystemLevel
    @Column(name = "CREATED_BY", length = 50)
    private String createdBy;

    @SystemLevel
    @Column(name = "UPDATE_TS")
    private Date updateTs;

    @SystemLevel
    @Column(name = "UPDATED_BY", length = 50)
    private String updatedBy;

    @SystemLevel
    @Column(name = "DELETE_TS")
    private Date deleteTs;

    @SystemLevel
    @Column(name = "DELETED_BY", length = 50)
    private String deletedBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    @Column(name = "NAME", length = 255)
    @NotNull
    private String name;

    @Column(name = "HAS_ATTACHMENTS")
    private Boolean hasAttachments;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Department getParentDepartment() {
        return parentDepartment;
    }

    public void setParentDepartment(Department parentDepartment) {
        this.parentDepartment = parentDepartment;
    }

    public List<CorrespondentAttachment> getCorrespondentAttachments() {
        return correspondentAttachments;
    }

    public void setCorrespondentAttachments(List<CorrespondentAttachment> correspondentAttachments) {
        this.correspondentAttachments = correspondentAttachments;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getDeleteTs() {
        return deleteTs;
    }

    public void setDeleteTs(Date deleteTs) {
        this.deleteTs = deleteTs;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @InstanceName
    @DependsOnProperties({"name", "organization"})
    public String getNameWithOrganization() {
        return String.format("%s (%s)", name != null ? name : "", organization != null ? organization.getName() : "");
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", organization=" + (organization != null ? organization.getName() : "null") +
                '}';
    }
}