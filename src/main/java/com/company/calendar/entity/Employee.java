package com.company.calendar.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import io.jmix.core.metamodel.annotation.InstanceName;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import jakarta.persistence.TemporalType;


@JmixEntity
@Table(name = "DF_EMPLOYEE")
@Entity(name = "df_Employee")
public class Employee {

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @CreatedBy
    @Column(name = "CREATED_BY", length = 50)
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTs;

    @LastModifiedBy
    @Column(name = "UPDATED_BY", length = 50)
    private String updatedBy;

    @LastModifiedDate
    @Column(name = "UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTs;

    @Column(name = "DELETED_BY", length = 50)
    private String deletedBy;

    @Column(name = "DELETE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteTs;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "BIRTHDAY")
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Column(name = "EDM_CERTIFICATE_THUMBPRINT")
    @Size(max = 255)
    private String emdCertificateThumbprint;

    @Column(name = "LAST_NAME")
    @Size(max = 255)
    @NotNull
    private String lastName;

    @JoinColumn(name = "PERSONAL_DATA_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonalData personalData;

    @JoinColumn(name = "HR_DATA_ID", nullable = false)
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private HrData hrData;

    @JoinTable(name = "TS_POWER_OF_ATTORNEY_REG_ITEM",
    joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
    inverseJoinColumns = @JoinColumn(name = "POWEROFATTORNEYREGITEM_ID"))
    @ManyToMany
    private List<PowerOfAttorneyRegItem> powerOfAttorneyList;

    @Column(name = "NUMBER_", length = 50)
    private String number;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeDepartmentPositionRelation> employeeDepartmentPositionRelations;

    @JoinColumn(name = "DEF_EDM_POA_REG_ITEM_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PowerOfAttorneyRegItem defaultEdmPowerOfAttorney;

    @Column(name = "HAS_ATTACHMENTS")
    private Boolean hasAttachments;

    @Column(name = "FAX", length = 100)
    private String fax;

    @JoinColumn(name = "DEPARTMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @Email
    @Column(name = "EMAIL", length = 100)
    private String email;

    @JoinColumn(name = "FACSIMILE_FILE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private FileDescriptor facsimile;

    @Column(name = "SEX")
    private String sex;

    @JoinColumn(name = "DEF_POA_REG_ITEM_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PowerOfAttorneyRegItem defaultPowerOfAttorney;

    @JoinColumn(name = "PHOTO_FILE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private FileDescriptor photo;

    @JoinColumn(name = "AVATAR_FILE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private FileDescriptor avatar;

    @Column(name = "FIRST_NAME")
    @Size(max = 255)
    @NotNull
    private String firstName;

    @Column(name = "MOBILE_PHONE", length = 100)
    private String mobilePhone;

    @Column(name = "PHONE", length = 100)
    private String phone;

    @JoinColumn(name = "ORGANIZATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Organization organization;

    @InstanceName
    @Column(name = "NAME")
    @Size(max = 255)
    private String name;

    @Column(name = "MIDDLE_NAME")
    @Size(max = 255)
    private String middleName;

    @Column(name = "COMMENT_", length = 1000)
    private String comment;

    @JoinColumn(name = "POSITION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Position position;

    @JoinColumn(name = "MOBILE_AVATAR_FILE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private FileDescriptor mobileAvatar;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany (mappedBy = "correspondent")
    private List<CorrespondentAttachment>
    correspondentAttachments;
    private UUID personalDataId;

    public void setCorrespondentAttachments(List<CorrespondentAttachment>correspondentAttachments){
        this.correspondentAttachments = correspondentAttachments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FileDescriptor getMobileAvatar() {
        return mobileAvatar;
    }

    public void setMobileAvatar(FileDescriptor mobileAvatar) {
        this.mobileAvatar = mobileAvatar;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // getName исправить
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public FileDescriptor getAvatar() {
        return avatar;
    }

    public void setAvatar(FileDescriptor avatar) {
        this.avatar = avatar;
    }

    public FileDescriptor getPhoto() {
        return photo;
    }

    public void setPhoto(FileDescriptor photo) {
        this.photo = photo;
    }

    public PowerOfAttorneyRegItem getDefaultPowerOfAttorney() {
        return defaultPowerOfAttorney;
    }

    public void setDefaultPowerOfAttorney(PowerOfAttorneyRegItem defaultPowerOfAttorney) {
        this.defaultPowerOfAttorney = defaultPowerOfAttorney;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public FileDescriptor getFacsimile() {
        return facsimile;
    }

    public void setFacsimile(FileDescriptor facsimile) {
        this.facsimile = facsimile;
    }

    public CorrespondentAttachment getCorrespondentAttachments() {
        return null;
    }

    public void setCorrespondentAttachments(CorrespondentAttachment correspondentAttachments) {
        this.correspondentAttachments = (List<CorrespondentAttachment>) correspondentAttachments;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public UUID getPersonalDataId() {
        UUID personalDataId = null;
        return personalDataId;
    }

    public void setPersonalDataId(UUID personalDataId) {
        this.personalDataId = personalDataId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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

    public PowerOfAttorneyRegItem getDefaultEdmPowerOfAttorney() {
        return defaultEdmPowerOfAttorney;
    }

    public void setDefaultEdmPowerOfAttorney(PowerOfAttorneyRegItem defaultEdmPowerOfAttorney) {
        this.defaultEdmPowerOfAttorney = defaultEdmPowerOfAttorney;
    }

    public List<EmployeeDepartmentPositionRelation> getEmployeeDepartmentPositionRelations() {
        return employeeDepartmentPositionRelations;
    }

    public void setEmployeeDepartmentPositionRelations(List<EmployeeDepartmentPositionRelation> employeeDepartmentPositionRelations) {
        this.employeeDepartmentPositionRelations = employeeDepartmentPositionRelations;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<PowerOfAttorneyRegItem> getPowerOfAttorneyList() {
        return powerOfAttorneyList;
    }

    public void setPowerOfAttorneyList(List<PowerOfAttorneyRegItem> powerOfAttorneyList) {
        this.powerOfAttorneyList = powerOfAttorneyList;
    }

    public HrData getHrData() {
        return hrData;
    }

    public void setHrData(HrData hrData) {
        this.hrData = hrData;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmdCertificateThumbprint() {
        return emdCertificateThumbprint;
    }

    public void setEmdCertificateThumbprint(String emdCertificateThumbprint) {
        this.emdCertificateThumbprint = emdCertificateThumbprint;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

    public Date getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}