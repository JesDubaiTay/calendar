package com.company.calendar.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.SystemLevel;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Entity(name = "Organization")
@Table(name = "DF_ORGANIZATION")
public class Organization {

    @Id
    @Column(name = "ID")
    @JmixGeneratedValue
    private UUID id;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    @Column(name = "CODE", length = 20)
    private String code;

    @OneToMany(mappedBy = "organization")  // OrganizationAttachment -> organization
    private List<OrganizationAttachment> attachments; // Вложения(1:N)

    @SystemLevel
    @Column(name = "DELETE_TS")
    private Date deleteTs;

    @SystemLevel
    @Column(name = "DELETED_BY", length = 50)
    private String deletedBy;

    @Column(name = "LEGAL_ADDRESS", length = 300)
    private String legalAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SECRETARY_ID")
    private User secretary;

    @SystemLevel
    @Column(name = "CREATE_TS")
    private Date createTs;

    @Column(name = "FAX", length = 100)
    private String fax;

    @Column(name = "HAS_ATTACHMENTS")
    private Boolean hasAttachments;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "OGRN", length = 13)
    private String ogrn;

    @SystemLevel
    @Column(name = "UPDATE_TS")
    private Date updateTs;

    @SystemLevel
    @Column(name = "UPDATED_BY", length = 50)
    private String updatedBy;

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
    public List<OrganizationAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<OrganizationAttachment> attachments) {
        this.attachments = attachments;
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

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public User getSecretary() {
        return secretary;
    }

    public void setSecretary(User secretary) {
        this.secretary = secretary;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Boolean getHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
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

    @InstanceName
    public String getInstanceName() {
        return code; //либо другое поле для отображения name
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Object getName() {
        return null;
    }
}