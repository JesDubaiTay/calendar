
package com.company.calendar.entity;

import io.jmix.core.HasTimeZone;
import io.jmix.core.annotation.Secret;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.SystemLevel;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.UUID;
import java.util.Date;
import com.company.calendar.entity.Organization;
import com.company.calendar.entity.Employee;
import com.company.calendar.entity.Group;
import com.company.calendar.entity.UserRole;

import java.util.List;

@JmixEntity
@Table(name = "SEC_USER")
public class User implements HasTimeZone, UserDetails {

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "LAST_NAME", length = 255)
    private String lastName;

    @Column(name = "ACTIVE_DIRECTORY_ID", length = 255)
    private String activeDirectoryID;

    @SystemLevel
    @Column(name = "LOGIN_LC", length = 50)
    private String loginLowerCase;

    @Column(name = "DEPARTMENT_CODE", length = 20)
    private String departmentCode;

    @Column(name = "LOGIN", length = 50, unique = true)
    private String login;

    @Secret
    @Column(name = "PASSWORD", length = 255)
    @SystemLevel
    private String password;

    @Column(name = "CHANGE_PASSWORD_AT_LOGON")
    private Boolean changePasswordAtNextLogon;

    @Column(name = "TIME_ZONE_AUTO")
    private Boolean timeZoneAuto;

    @Email
    @Column(name = "EMAIL", length = 100)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_ID")
    private Group group;

    @Column(name = "TIME_ZONE", length = 255)
    private String timeZone;

    @Column(name = "ACTIVE")
    private Boolean active = true;

    @Column(name = "GROUP_NAMES", length = 255)
    @SystemLevel
    private String groupNames;

    @Column(name = "FIRST_NAME", length = 255)
    private String firstName;

    @OneToMany(mappedBy = "user")
    private List<UserRole> userRoles;

    @SystemLevel
    @Column(name = "PASSWORD_ENCRYPTION", length = 50)
    private String passwordEncryption;

    @Column(name = "USE_ACTIVE_DIRECTORY")
    private Boolean useActiveDirectory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    @Column(name = "NAME", length = 255)
    private String name;

    @Column(name = "MIDDLE_NAME", length = 255)
    private String middleName;

    @SystemLevel
    @Column(name = "SYS_TENANT_ID", length = 255)
    private String sysTenantId;

    @Column(name = "POSITION_", length = 255)
    private String position;

    @OneToMany(mappedBy = "user")
    private List<Employee> employees;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    private TsUserAdditionalInfo userAdditionalInfo;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    @Transient
    private Collection<GrantedAuthority> authorities;

    @InstanceName
    @DependsOnProperties({"firstName", "lastName", "login"})
    public String getDisplayName() {
        return (firstName != null ? firstName : "") + " " + (lastName != null ? lastName : "") + (login != null ? " (" + login + ")" : "");
    }

    @Override
    public String getTimeZoneId() {
        return timeZone;
    }

    public void setTimeZoneId(String timeZone) {
        this.timeZone = timeZone;
    }

    public TsUserAdditionalInfo getUserAdditionalInfo() {
        return userAdditionalInfo;
    }

    public void setUserAdditionalInfo(TsUserAdditionalInfo userAdditionalInfo) {
        this.userAdditionalInfo = userAdditionalInfo;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSysTenantId() {
        return sysTenantId;
    }

    public void setSysTenantId(String sysTenantId) {
        this.sysTenantId = sysTenantId;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

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

    public Boolean getUseActiveDirectory() {
        return useActiveDirectory;
    }

    public void setUseActiveDirectory(Boolean useActiveDirectory) {
        this.useActiveDirectory = useActiveDirectory;
    }

    public String getPasswordEncryption() {
        return passwordEncryption;
    }

    public void setPasswordEncryption(String passwordEncryption) {
        this.passwordEncryption = passwordEncryption;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(String groupNames) {
        this.groupNames = groupNames;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getTimeZoneAuto() {
        return timeZoneAuto;
    }

    public void setTimeZoneAuto(Boolean timeZoneAuto) {
        this.timeZoneAuto = timeZoneAuto;
    }

    public Boolean getChangePasswordAtNextLogon() {
        return changePasswordAtNextLogon;
    }

    public void setChangePasswordAtNextLogon(Boolean changePasswordAtNextLogon) {
        this.changePasswordAtNextLogon = changePasswordAtNextLogon;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getLoginLowerCase() {
        return loginLowerCase;
    }

    public void setLoginLowerCase(String loginLowerCase) {
        this.loginLowerCase = loginLowerCase;
    }

    public String getActiveDirectoryID() {
        return activeDirectoryID;
    }

    public void setActiveDirectoryID(String activeDirectoryID) {
        this.activeDirectoryID = activeDirectoryID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Временная реализация:  Замените на вашу логику получения ролей
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }

    public void setAuthorities(Collection<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public void setUsername(String s) {
    }
}
