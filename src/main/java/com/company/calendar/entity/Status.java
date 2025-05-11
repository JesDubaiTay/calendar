package com.company.calendar.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum Status implements EnumClass<String> {

    PENDING("Pending"),
    CONFIRMED("Confirmed"),
    CANCELLED("Cansled"),
    COMPLETED("Comlited");

    private final String id;

    Status(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }


    @Nullable
    public static Status fromId(String id) {
        for (Status at : Status.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}