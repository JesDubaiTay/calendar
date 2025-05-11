package com.company.calendar.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "DF_CORRESPONDENT_ATTACHMENT") // Замените на фактическое имя вашей таблицы
@Entity(name = "CorrespondentAttachment")
public class CorrespondentAttachment {

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "CORRESPONDENT_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Employee correspondent; // Или другой класс, если "корреспондент" это не всегда сотрудник

    @JoinColumn(name = "FILE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private FileDescriptor file;

    @Column(name = "DESCRIPTION")
    private String description;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FileDescriptor getFile() {
        return file;
    }

    public void setFile(FileDescriptor file) {
        this.file = file;
    }

    public Employee getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(Employee correspondent) {
        this.correspondent = correspondent;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}