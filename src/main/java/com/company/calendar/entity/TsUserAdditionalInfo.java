package com.company.calendar.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import java.util.UUID;

@JmixEntity
@Table(name = "TS_USER_ADDITIONAL_INFO")
public class TsUserAdditionalInfo {

    @JmixId
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false) // Добавлено, чтобы указать, что это поле ID
    @Id // Добавлено, чтобы указать, что это поле ID
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY) // Добавлено: Указываем, что это связь OneToOne
    @JoinColumn(name = "USER_ID") // Добавлено: Указываем внешний ключ в этой таблице, связывающий с User
    private User user;

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

    @InstanceName
    public String getInstanceName() {
        return (user != null ? user.getLogin() : "TsUserAdditionalInfo-" + id); // Пример отображения имени экземпляра
    }

}