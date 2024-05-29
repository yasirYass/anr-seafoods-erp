package com.fish.anr_seafoods_erp.enums;
public enum UserRole {

    ADMIN(1),
    USER(2);


    private final int value;

    UserRole(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
